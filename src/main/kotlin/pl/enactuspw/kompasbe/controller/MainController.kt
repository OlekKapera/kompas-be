package pl.enactuspw.kompasbe.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import pl.enactuspw.kompasbe.model.CalculatorForm

@RestController
class MainController {

    @GetMapping("/")
    fun calculate(@RequestBody body: CalculatorForm): String {
        return body.toString()
//    nowe
//        jednorodzinne 63.6
//        wileorodzinne 71
//
//    im EKw lepsze tym lepiej
//        w - ciepla woda uzytkow
//        h - centralne ogrzewanie
//    na razie samo źródło
//
//    nowy stary
//    jedno wielo rodzinny
//    nowy jedno ->
//        podaje powierchnie
//        Euw = 24.1 * Af
//        sprawność która poda uzytkownik G
//        liczymy EKw
//
//    stare
//        rachunki za gaz <- od użytkownika -> koszty energii roczne (/3 * 12)
//        jak elektrycznie ogrzewał to olewamy
//        stare EK
    }
}