package com.stefanprvanovic.tracki.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stefanprvanovic.tracki.database.entitys.Attendance
import com.stefanprvanovic.tracki.database.entitys.Personnel
import com.stefanprvanovic.tracki.database.entitys.User
import com.stefanprvanovic.tracki.database.entitys.WorkStation

@Database(
    entities = [Attendance::class, Personnel::class, User::class, WorkStation::class],
    version = 1
)
abstract class TrackiDatabase : RoomDatabase() {

}