package com.goodbeta.cliente.dao

import com.goodbeta.cliente.model.Feedback
import androidx.room.Dao
import androidx.room.Query

@Dao
abstract class FeedBackDao : BaseDao<Feedback> {

    @Query("SELECT * FROM FEEDBACK")
    abstract fun buscaTodos() : List<Feedback>

}