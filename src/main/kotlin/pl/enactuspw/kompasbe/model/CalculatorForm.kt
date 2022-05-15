package pl.enactuspw.kompasbe.model

data class CalculatorForm(
    val consideredSource: List<Source>,
    val isSingleFamily: Boolean,
    val isConsideringPhotovoltaic: Boolean,
    val residentialArea: Float,
    val voivodeship: Voivodeship,
    val hasGas: Boolean,
)
