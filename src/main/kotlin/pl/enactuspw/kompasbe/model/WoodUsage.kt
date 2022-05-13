package pl.enactuspw.kompasbe.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class WoodUsage(
    @Id
    val buildingConstructionRange: BuildingConstructionRange,
    val usageValue: Float,
)
