// Essa classe será o repositório de dados randomicos de potência
package com.sophiamoraes.iniciacao_cientifica.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Power_Repository {
    private val _powerRepository =  MutableLiveData<Power_Repository>()
    val powerRepository: LiveData<Power_Repository> = _powerRepository
    




}