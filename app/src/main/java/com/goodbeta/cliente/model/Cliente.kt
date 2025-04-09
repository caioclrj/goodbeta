package com.goodbeta.cliente.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CLIENTE" )
data class Cliente(
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo( name = "ID") val id : Int,
    @ColumnInfo( name = "TX_NOME") val nome : String,
    @ColumnInfo( name = "IN_STATUS") val status : Boolean,
    @ColumnInfo( name = "TX_APELIDO") val apelido : String,
    @ColumnInfo( name = "TX_SENHA") val senha : String
)
