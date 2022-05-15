package com.tanzir.blooddonor.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tanzir.blooddonor.modelClass.DonarPerson

@Dao
interface DonarDao {

    @Insert
    suspend fun insertDonar(donarPerson: DonarPerson)

    @Query("select * from tbl_donar")
     fun getAll(): LiveData<List<DonarPerson>>

}