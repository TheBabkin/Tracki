package com.stefanprvanovic.tracki.database.entitys

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Personnel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val fullName: String,
    val uniqueNumber: Long,
    val workStation: String
)