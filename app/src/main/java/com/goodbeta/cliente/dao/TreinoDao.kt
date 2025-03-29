package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Treino

class TreinoDao {
    fun adiciona(treino: Treino){
        TODO("Incluir treino")
    }

    fun buscaTodos() : List<Treino> {
        return treino.toList()
    }

    companion object {
        private val treino = mutableListOf<Treino>()
    }

}