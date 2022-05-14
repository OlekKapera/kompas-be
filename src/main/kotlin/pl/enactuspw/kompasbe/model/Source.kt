package pl.enactuspw.kompasbe.model

enum class Source(val ng: Float) {
    COAL(1f),
    WATER(1f),
    GAS(0.85f),
    WOOD(1f),
    ELECTRICITY(1f)
}