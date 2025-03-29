package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Programacao

class ProgramacaoDao {
    fun adiciona(programacao: Programacao){
        TODO("Incluir Programacao")
    }

    fun buscaTodos() : List<Programacao> {
        return Programacao.toList()
    }

    companion object {
        private val Programacao = mutableListOf<Programacao>()
    }

}
