package pl.enactuspw.kompasbe.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class WaterUsage(
    @Id
    val apartmentEquipment: ApartmentEquipment,
    val perInhabitantPerDay: Float,
    val perInhabitantPerMonth: Float,
)
