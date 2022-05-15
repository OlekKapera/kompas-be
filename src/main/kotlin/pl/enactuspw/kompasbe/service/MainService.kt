package pl.enactuspw.kompasbe.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import pl.enactuspw.kompasbe.controller.CalculatedResponse
import pl.enactuspw.kompasbe.model.Fuel
import pl.enactuspw.kompasbe.model.Source
import pl.enactuspw.kompasbe.repository.FuelRepository

@Service
class MainService {

    @Autowired
    private lateinit var fuelRepository: FuelRepository

    fun getFuel(source: Source): List<Fuel> {
        return fuelRepository.findAll().toList()
    }

    fun calculateNewHouse(isSingleFamily: Boolean, area: Float, source: Source): CalculatedResponse {
        val fuel =
            fuelRepository.findById(source).orElseThrow { RuntimeException("Fuel of type $source was not found") }

        val EP = if (isSingleFamily) 70 else 65
        val EK = EP / 1.1f
        val EUw = 24.1f * area
        val EKw = EUw / (fuel.ng * 0.85f * 1 * 1)
        val EKh = EK - EKw

        val KE = EK * fuel.fuelCost
        val LCCLow = fuel.initialCost + 0.3f * fuel.initialCost + 15 * KE
        val LCCHigh = fuel.initialCost + 0.45f * fuel.initialCost + 15 * KE

        return CalculatedResponse(source = source, KE = KE, LCCLow = LCCLow, LCCHigh = LCCHigh)
    }
}