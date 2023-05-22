package com.stefanprvanovic.tracki.database.entitys

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WorkStation(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val workStationName: String
)