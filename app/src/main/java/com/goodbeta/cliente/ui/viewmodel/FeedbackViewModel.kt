package com.goodbeta.cliente.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.goodbeta.cliente.database.AppDatabase
import com.goodbeta.cliente.model.Execucao
import com.goodbeta.cliente.model.Feedback
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar

class FeedbackViewModel(application: Application) : AndroidViewModel(application) {
    private val meuFeedbackDao = AppDatabase.getInstance(application).feedbackDao()
    private val minhaExecucaoDao = AppDatabase.getInstance(application).execucaoDao()
    val feedbackLiveData = MutableLiveData<Feedback>()
    val execucaoLiveData = MutableLiveData<Execucao>()
    val execucao = MutableLiveData<Int>()
    val cliente = MutableLiveData<Int>()
    val dataRegistro = Calendar.getInstance().timeInMillis
    val descricao = MutableLiveData<String>()
    val nota = MutableLiveData<Int>()

    fun buscarExecucao(id: Int) {
        viewModelScope.launch {
            val execucaoLive = withContext(Dispatchers.IO) {
                minhaExecucaoDao.buscarUm(id)
            }
            execucaoLiveData.value = execucaoLive
        }
    }

    fun salvarFeedback(novoFeedback: Feedback) {
        if (novoFeedback.cliente != 0 && novoFeedback.execucao != 0) {
            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    meuFeedbackDao.incluiUm(novoFeedback)
                }
            }
        }
    }
}