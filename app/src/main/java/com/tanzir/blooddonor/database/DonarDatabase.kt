package com.tanzir.blooddonor.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tanzir.blooddonor.daos.DonarDao
import com.tanzir.blooddonor.modelClass.DonarPerson

@Database(entities = [DonarPerson::class], version = 1)
abstract class DonarDatabase:RoomDatabase() {

    abstract fun getDonarDao():DonarDao

    companion object {
        private var db: DonarDatabase? = null
        fun getDB(context: Context) : DonarDatabase {
            if (db == null) {
                db = Room.databaseBuilder(
                    context,
                    DonarDatabase::class.java,
                    "blood_donar_db"
                ).build()
                return db!!
            }
            return db!!
        }
    }
}