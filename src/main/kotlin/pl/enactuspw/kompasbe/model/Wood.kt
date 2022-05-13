package pl.enactuspw.kompasbe.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Wood(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val voivodeship: Voivodeship,
    val pineMin: Float,
    val pineMax: Float,
    val beechMin: Float,
    val beechMax: Float,
    val hornbeamMin: Float,
    val hornbeamMax: Float,
)
