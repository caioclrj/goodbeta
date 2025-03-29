package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Feedback

class FeedBackDao {
    fun adiciona(feedback: Feedback){
        TODO("Incluir Feedback")
    }

    fun buscaTodos() : List<Feedback> {
        return feedBack.toList()
    }

    companion object {
        private val feedBack = mutableListOf<Feedback>()
    }

}