package com.tanzir.blooddonor.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.tanzir.blooddonor.database.DonarDatabase
import com.tanzir.blooddonor.modelClass.DonarPerson
import com.tanzir.blooddonor.repository.DonarRepository
import kotlinx.coroutines.launch

class DonarViewModel(application: Application) : AndroidViewModel(application) {
    private val donarDao = DonarDatabase.getDB(application).getDonarDao()

    private val repository = DonarRepository(donarDao)
    fun insertDonar(donarPerson: DonarPerson){
        viewModelScope.launch {
            repository.insertDonar(donarPerson)
        }
    }

     fun getAllDonar() : LiveData<List<DonarPerson>> = repository.getAllDonar()


}


