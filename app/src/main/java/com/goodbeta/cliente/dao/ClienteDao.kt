package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Cliente

class ClienteDao {
    fun adiciona(Cliente: Cliente){
        TODO("Incluir Cliente")
    }

    fun buscaTodos() : List<Cliente> {
        return Cliente.toList()
    }

    companion object {
        private val Cliente = mutableListOf<Cliente>()
    }

}

