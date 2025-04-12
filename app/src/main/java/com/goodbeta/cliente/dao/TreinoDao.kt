package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Treino
import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class TreinoDao : BaseDao<Treino> {

    @Query("SELECT * FROM TREINO")
    abstract fun buscaTodos() : List<Treino>
    @Query("SELECT * FROM TREINO WHERE ID = :i")
    abstract fun buscaUm(i: Int) : Treino

}