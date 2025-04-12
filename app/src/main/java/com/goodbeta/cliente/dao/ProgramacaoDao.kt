package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Programacao
import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class ProgramacaoDao : BaseDao<Programacao> {

    @Query("SELECT * FROM PROGRAMACAO")
    abstract fun buscaTodos() : List<Programacao>
    @Query("SELECT * FROM PROGRAMACAO WHERE ID_CLIENTE = :id")
    abstract fun buscaUm(id: Int) : Programacao

}
