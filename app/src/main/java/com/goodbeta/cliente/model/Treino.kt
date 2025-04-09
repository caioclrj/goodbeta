package com.goodbeta.cliente.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TREINO" )
data class Treino (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo( name = "ID") val id : Int,
    @ColumnInfo( name = "TX_DESCRICAO") val descricao : String,
    @ColumnInfo( name = "TX_MODULO") val modulo : String,
    @ColumnInfo( name = "TX_TIPO") val tipo: String,
    @ColumnInfo( name = "TX_LOCALIZADO") val localizado : String,
    @ColumnInfo( name = "NR_DURACAO") val duracao : Int,
    @ColumnInfo( name = "NR_REPETICAO") val repeticao : Int,
    @ColumnInfo( name = "NR_ORDEM") val ordem : Int
    )
