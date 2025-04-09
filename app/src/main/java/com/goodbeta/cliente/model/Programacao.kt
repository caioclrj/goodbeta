package com.goodbeta.cliente.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "PROGRAMACAO",
    indices = [
        Index(  name = "AK_PROGRAMACAO",
            value = ["ID_CLIENTE", "ID_TREINO", "DT_INICIO", "DT_FINAL"],
            unique = true
        ),
    ],
    foreignKeys = [
        ForeignKey(entity = Cliente::class,
            parentColumns = arrayOf("ID"),
            childColumns = arrayOf("ID_CLIENTE")),
        ForeignKey(entity = Treino::class,
            parentColumns = arrayOf("ID"),
            childColumns = arrayOf("ID_CLIENTE")),
    ]
)

data class Programacao(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo( name = "ID") val id : Int,
    @ColumnInfo( name = "ID_CLIENTE") val cliente: Cliente,
    @ColumnInfo( name = "ID_TREINO") val treino : Treino,
    @ColumnInfo( name = "DT_INICIO") val dataInicial : Date,
    @ColumnInfo( name = "DT_FINAL") val dataFinal : Date
)
