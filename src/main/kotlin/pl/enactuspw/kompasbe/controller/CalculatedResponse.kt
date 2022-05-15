package pl.enactuspw.kompasbe.controller

import pl.enactuspw.kompasbe.model.Source

data class CalculatedResponse(
    val source: Source,
    val KE: Float,
    val LCCHigh: Float,
    val LCCLow: Float,
)
