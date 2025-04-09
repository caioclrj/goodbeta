package com.goodbeta.cliente.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "EXECUCAO",
        indices = [
            Index(  name = "AK_EXECUCAO",
                    value = ["ID_CLIENTE", "ID_TREINO", "DT_REGISTRO"],
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

data class Execucao(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo( name = "ID") val id : Int,
    @ColumnInfo( name = "ID_CLIENTE") val cliente: Cliente,
    @ColumnInfo( name = "ID_TREINO") val treino : Treino,
    @ColumnInfo( name = "DT_REGISTRO") val dataRegistro : Date,
    @ColumnInfo( name = "IN_STATUS") val status : Boolean
) {
}