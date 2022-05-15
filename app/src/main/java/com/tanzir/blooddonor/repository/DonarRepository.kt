package com.tanzir.blooddonor.repository

import androidx.lifecycle.LiveData
import com.tanzir.blooddonor.daos.DonarDao
import com.tanzir.blooddonor.modelClass.DonarPerson

class DonarRepository(val donarDao: DonarDao) {

    suspend fun insertDonar(donarPerson: DonarPerson) {
        donarDao.insertDonar(donarPerson)
    }
     fun getAllDonar() : LiveData<List<DonarPerson>> = donarDao.getAll()

}