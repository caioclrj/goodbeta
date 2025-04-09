package com.goodbeta.cliente.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Upsert

interface BaseDao<T> {

    /*Inclui 1*/
    @Insert
    fun incluiUm( obj: T)

    /*Inclui varios*/
    @Insert
    fun incluiN(vararg obj: T)

    /*Inclui vários*/
    @Insert
    fun incluiLista( obj : List<T>)

    /*Atualiza 1*/
    @Update
    fun atualizaUm(obj : T)

    /*Atualiza varios*/
    @Update
    fun atualizaN(vararg obj : T)

    /*Tenta alterar, caso não exista, inclui*/
    @Upsert
    fun atualui(obj : T)

    /*Exclui 1*/
    @Delete
    fun excluiUm(obj : T)

    /*Exclui varios*/
    @Delete
    fun excluiN(vararg obj : T)
}