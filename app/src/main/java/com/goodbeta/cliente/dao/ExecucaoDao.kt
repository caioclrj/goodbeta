package com.goodbeta.cliente.dao


import com.goodbeta.cliente.model.Execucao

class ExecucaoDao {
    fun adiciona(execucao: Execucao){
        TODO("Incluir Execucao")
    }

    fun buscaTodos() : List<Execucao> {
        return Execucao.toList()
    }

    companion object {
        private val Execucao = mutableListOf<Execucao>()
    }

}

