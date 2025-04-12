package com.goodbeta.cliente.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.goodbeta.cliente.database.AppDatabase
import com.goodbeta.cliente.model.Execucao
import com.goodbeta.cliente.model.Programacao
import com.goodbeta.cliente.model.Treino
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar

class ExecucaoViewModel (application: Application) : AndroidViewModel(application) {
    private val execucaoDao = AppDatabase.getInstance(application).execucaoDao()
    private val programacaoDao = AppDatabase.getInstance(application).programacaoDao()
    private val treinoDao = AppDatabase.getInstance(application).treinoDao()
    val treinoLiveData = MutableLiveData<Treino?>()
    val execucaoLiveData = MutableLiveData<Execucao>()
    val programacaoLiveData = MutableLiveData<Programacao>()
    val dataRegistro = Calendar.getInstance().timeInMillis
    val status = false
    var descricao = MutableLiveData<String>()
    var modulo = MutableLiveData<String>()
    var tipo = MutableLiveData<String>()
    var localizado = MutableLiveData<String>()
    var duracao = MutableLiveData<String>()
    var repeticao = MutableLiveData<String>()

    private fun CoroutineScope.MultableLiveData(string: String): MutableLiveData<String> {
        // TODO: Criar função de conversão
        return TODO("Provide the return value")
    }
    private fun CoroutineScope.MultableLiveData(int: Int): MutableLiveData<String> {
        // TODO: Criar função de conversão
        return TODO("Provide the return value")
    }

    fun salvarExecucao(cliente : Int , treino : Int) {
        if (!(cliente.equals(0)) && !(treino.equals(0))) {
            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    val novaExecucao = Execucao(
                        cliente = cliente,
                        treino = treino,
                        dataRegistro = dataRegistro,
                        status = status,
                        id = 0
                    )
                    execucaoDao.incluiUm(novaExecucao)

                    fun buscarProgramacao(id : Int) {
                        viewModelScope.launch {
                            val programacao = withContext(Dispatchers.IO) {
                                programacaoDao.buscaUm(id)
                            }
                            programacaoLiveData.value = programacao

                        }
                    }

                    fun buscarTreino(id : Int) {
                        viewModelScope.launch {
                            val treino = withContext(Dispatchers.IO) {

                                treinoDao.buscaUm(id)
                            }
                            treinoLiveData.value = treino
                            val aux = treinoLiveData.value ?: null
                            if (aux != null) {
                                descricao = MultableLiveData(aux.descricao)
                                modulo = MultableLiveData(aux.modulo)
                                tipo = MultableLiveData(aux.tipo)
                                localizado = MultableLiveData(aux.localizado)
                                duracao = MultableLiveData(aux.duracao)
                                repeticao = MultableLiveData(aux.repeticao)
                            }
                        }
                    }
                }

            }
        }
    }
}
