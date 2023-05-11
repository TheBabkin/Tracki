package com.stefanprvanovic.tracki.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stefanprvanovic.tracki.database.entitys.Attendance
import com.stefanprvanovic.tracki.database.entitys.Personnel

@Database(entities = [Attendance::class, Personnel::class], version = 1)
abstract class TrackiDatabase : RoomDatabase() {

}