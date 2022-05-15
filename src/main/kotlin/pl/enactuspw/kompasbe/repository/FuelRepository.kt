package pl.enactuspw.kompasbe.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import pl.enactuspw.kompasbe.model.Fuel
import pl.enactuspw.kompasbe.model.Source

@Repository
interface FuelRepository : CrudRepository<Fuel, Source> {
}