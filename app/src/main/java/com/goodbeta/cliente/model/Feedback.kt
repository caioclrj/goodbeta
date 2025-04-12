package com.goodbeta.cliente.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "FEEDBACK",
    indices = [
        Index(  name = "AK_FEEDBACK",
            value = ["ID_EXECUCAO", "ID_CLIENTE", "DT_REGISTRO"],
            unique = true
        ),
    ],
    foreignKeys = [
        ForeignKey(
            entity = Cliente::class,
            parentColumns = arrayOf("ID"),
            childColumns = arrayOf("ID_CLIENTE")),
        ForeignKey(entity = Execucao::class,
            parentColumns = arrayOf("ID"),
            childColumns = arrayOf("ID_EXECUCAO")),
    ]
)
data class Feedback (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo( name = "ID") val id : Int,
    @ColumnInfo( name = "ID_EXECUCAO") val execucao : Int,
    @ColumnInfo( name = "ID_CLIENTE") val cliente : Int,
    @ColumnInfo( name = "DT_REGISTRO") val dataRegistro: Long,
    @ColumnInfo( name = "TX_DESCRICAO") val descricao : String,
    @ColumnInfo( name = "NR_NOTA") val nota : Int
    )
