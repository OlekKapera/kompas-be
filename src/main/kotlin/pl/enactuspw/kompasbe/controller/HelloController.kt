package pl.enactuspw.kompasbe.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import pl.enactuspw.kompasbe.model.Hello
import pl.enactuspw.kompasbe.repository.HelloRepository

@RestController
class HelloController {

    @Autowired
    lateinit var repository: HelloRepository

    @GetMapping("/save")
    fun save(): String {
        repository.save(Hello(value = "a"))
        repository.save(Hello(value = "b"))
        return "Done and saved"
    }

    @GetMapping("/")
    fun hello() = repository.findAll()
}