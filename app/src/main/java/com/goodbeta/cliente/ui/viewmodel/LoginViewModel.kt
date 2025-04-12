package com.goodbeta.cliente.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.goodbeta.cliente.database.AppDatabase
import com.goodbeta.cliente.model.Cliente
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel (application: Application) : AndroidViewModel(application) {
    private val meuClienteDao = AppDatabase.getInstance(application.applicationContext).clienteDao()
    val clienteLiveData = MutableLiveData<Cliente>()
    val nome = MutableLiveData<String>()
    val senha = MutableLiveData<String>()
    val idBuscar = MutableLiveData<String>()

    fun buscarCliente(nome : String, senha : String) {
        val id = idBuscar.value?.toLongOrNull() ?: return
        viewModelScope.launch {
            val cliente = withContext(Dispatchers.IO) {
                meuClienteDao.buscaCliente(nome, senha)
            }
        }
        TODO("Implementar a logica de validação do cliente")
    }
}