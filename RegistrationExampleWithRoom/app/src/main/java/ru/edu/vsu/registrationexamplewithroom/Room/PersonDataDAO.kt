package ru.edu.vsu.registrationexamplewithroom.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDataDAO {

    @Insert(entity = PersonData::class)
    fun insertNewStatisticData(person : PersonData)

    @Query("SELECT * FROM person where id = :personId;")
    fun getPersonById(personId : Long): PersonData

    @Query("DELETE FROM person WHERE id = :personId;")
    fun deletePersonDataById(personId: Long)

}