package com.goodbeta.cliente.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.goodbeta.cliente.R
import com.goodbeta.cliente.databinding.ExecutionActivityBinding
import com.goodbeta.cliente.ui.viewmodel.ExecucaoViewModel

class ExecutionActivity : AppCompatActivity(R.layout.execution_activity) {
    private lateinit var execucaoBinding : ExecutionActivityBinding
    private lateinit var execucaoViewModel : ExecucaoViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?)
    {
        super.onCreate(savedInstanceState, persistentState)
        execucaoBinding = DataBindingUtil.setContentView(this, R.layout.execution_activity)
        execucaoViewModel = ViewModelProvider(this).get(ExecucaoViewModel::class.java)
        execucaoBinding.lifecycleOwner = this }

        override fun onResume() {
            super.onResume()
            TODO("Implementar o estado de resume")
        }

        override fun onPause() {
            super.onPause()
            TODO("Implementar o estado de pause")
        }

        override fun onStart() {
            super.onStart()
            TODO("Implementar o estado de start")
        }

        override fun onStop() {
            super.onStop()
            TODO("Implementar o estado de stop")

        }
        override fun onRestart() {
            super.onRestart()
            TODO("Implementar o estado de restart")
        }

        override fun onDestroy() {
            super.onDestroy()
        }
    }


