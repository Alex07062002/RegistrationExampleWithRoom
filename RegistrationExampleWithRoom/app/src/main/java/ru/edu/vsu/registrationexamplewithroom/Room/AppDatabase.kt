package ru.edu.vsu.registrationexamplewithroom.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        PersonData::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getPersonDataDAO() : PersonDataDAO
}
