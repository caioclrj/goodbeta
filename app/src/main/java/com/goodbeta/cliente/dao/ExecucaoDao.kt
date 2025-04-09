package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Execucao
import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class ExecucaoDao : BaseDao<Execucao> {

    @Query("SELECT * FROM EXECUCAO")
    abstract fun buscaTodos() : List<Execucao>

}

