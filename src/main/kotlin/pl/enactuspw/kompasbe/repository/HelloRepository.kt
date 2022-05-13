package pl.enactuspw.kompasbe.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import pl.enactuspw.kompasbe.model.Hello

@Repository
interface HelloRepository : CrudRepository<Hello, Long> {
}