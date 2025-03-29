package com.goodbeta.cliente.model

data class Treino (
    val id : Int,
    val descricao : String,
    val modulo : String,
    val tipo: String,
    val localizado : String,
    val duracao : Int,
    val repeticao : Int,
    val ordem : Int
    )
