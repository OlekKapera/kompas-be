package pl.enactuspw.kompasbe.model

import javax.persistence.*

@Entity
data class Fuel(
    @Id
    @Enumerated(EnumType.STRING)
    val source: Source,

    @Column(nullable = false)
    val ng: Float,

    @Column(nullable = false)
    val initialCost: Float,

    @Column(nullable = false)
    val fuelCost: Float
)