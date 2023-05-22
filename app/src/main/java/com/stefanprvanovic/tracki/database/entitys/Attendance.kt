package com.stefanprvanovic.tracki.database.entitys

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Attendance(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val personnelId: Int,
    val attendance: Boolean,
    val reasonForAbsence: String
)