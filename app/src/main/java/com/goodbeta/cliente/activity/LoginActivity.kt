package com.goodbeta.cliente.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.goodbeta.cliente.R
import com.goodbeta.cliente.databinding.LoginActivityBinding
import com.goodbeta.cliente.ui.viewmodel.LoginViewModel


class LoginActivity : AppCompatActivity(R.layout.login_activity) {

    private lateinit var loginBinding: LoginActivityBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        loginBinding = DataBindingUtil.setContentView(this, R.layout.login_activity)
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        loginBinding.lifecycleOwner = this
    }

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