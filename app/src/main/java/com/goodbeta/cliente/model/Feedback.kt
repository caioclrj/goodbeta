package com.goodbeta.cliente.model

import java.sql.Date

data class Feedback (
    val id : Int,
    val Execucao : Execucao,
    val Cliente : Cliente,
    val dataRegsitro: Date,
    val descricao : String,
    val nota : Int
    )
