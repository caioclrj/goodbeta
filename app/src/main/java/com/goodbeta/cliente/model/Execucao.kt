package com.goodbeta.cliente.model

import java.sql.Date

data class Execucao(
    val id : Int,
    val cliente: Cliente,
    val listaTreino : List<Treino>,
    val dataRegitro : Date,
    val status : Boolean
) {
}