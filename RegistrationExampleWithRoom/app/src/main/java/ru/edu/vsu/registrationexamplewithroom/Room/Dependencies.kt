package ru.edu.vsu.registrationexamplewithroom.Room

import android.content.Context
import androidx.room.Room

object Dependencies {

    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context
    }

    private val appDatabase: AppDatabase by lazy {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "database.db")
            .createFromAsset("room_registration.db")
            .build()
    }
}
/**
 *  continue with room: https://habr.com/ru/articles/713518/
 */