package com.goodbeta.cliente.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.goodbeta.cliente.dao.ClienteDao
import com.goodbeta.cliente.dao.ExecucaoDao
import com.goodbeta.cliente.dao.FeedBackDao
import com.goodbeta.cliente.dao.ProgramacaoDao
import com.goodbeta.cliente.dao.TreinoDao
import com.goodbeta.cliente.model.Cliente
import com.goodbeta.cliente.model.Execucao
import com.goodbeta.cliente.model.Feedback
import com.goodbeta.cliente.model.Programacao
import com.goodbeta.cliente.model.Treino

@Database(entities = [Cliente::class,
                        Treino::class,
                        Execucao::class,
                        Feedback::class,
                        Programacao::class],
          version = 1,
            exportSchema = false)

abstract class AppDatabase : RoomDatabase() {
    abstract fun clienteDao(): ClienteDao
    abstract fun execucaoDao(): ExecucaoDao
    abstract fun feedbackDao(): FeedBackDao
    abstract fun programacaoDao(): ProgramacaoDao
    abstract fun treinoDao(): TreinoDao

    companion object {
        private const val Database_NAME = "goodbeta.db"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {

            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        Database_NAME
                    ).createFromAsset("database/goodbeta.db").build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}

