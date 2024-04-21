package ru.edu.vsu.registrationexamplewithroom.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "person",
    indices = [Index("id")])
data class PersonData(
    @PrimaryKey(autoGenerate = true) val id : Long,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "surname") val surname : String,
    @ColumnInfo(name = "age") val age : UShort
)
