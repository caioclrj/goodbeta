package com.goodbeta.cliente.model

import java.sql.Date

data class Programacao(
    val id : Int,
    val cliente: Cliente,
    val listaTreino : List<Treino>,
    val dataInicio : Date,
    val dataFim : Date
)
