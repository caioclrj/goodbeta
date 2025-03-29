package com.goodbeta.cliente.model



data class Cliente(
    val id : Int,
    val nome : String,
    val status : Boolean,
    val apelido : String,
    val senha : String
)
