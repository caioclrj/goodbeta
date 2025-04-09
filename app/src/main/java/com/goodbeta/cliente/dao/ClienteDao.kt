package com.goodbeta.cliente.dao

import androidx.room.Dao
import androidx.room.Query
import com.goodbeta.cliente.model.Cliente

@Dao
abstract class ClienteDao : BaseDao<Cliente> {

    @Query("SELECT * FROM CLIENTE")
    abstract fun buscaTodos() : List<Cliente>

}

