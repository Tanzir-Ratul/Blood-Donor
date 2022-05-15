package com.tanzir.blooddonor.modelClass

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_donar")
data class DonarPerson(
    @PrimaryKey(autoGenerate = true)

    val id: Long=0,
    val name: String,
    val age: String,
    @ColumnInfo(name="phone_number")
    val phoneNumber: String,
    @ColumnInfo(name="blood_group")
    val bloodGroup: String,
    val gender: String,
    @ColumnInfo(name="date_of_birth")
    val dateOfBirth: String
)
