package pl.enactuspw.kompasbe.service

import org.springframework.stereotype.Service
import pl.enactuspw.kompasbe.model.Source

@Service
class MainService {

    fun calculateNewHouse(isSingleFamily: Boolean, area: Float, source: Source) {
        val EP = if (isSingleFamily) 70 else 65
        val EK = EP / 1.1
        val EUw = 24.1 * area
        val EKw = EUw / (source.ng * 0.85 * 1 * 1)
        val EKh = EK - EKw
    }
}