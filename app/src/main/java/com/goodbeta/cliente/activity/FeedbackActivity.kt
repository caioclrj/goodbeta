package com.goodbeta.cliente.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.goodbeta.cliente.R
import com.goodbeta.cliente.databinding.FeedbackActivityBinding
import com.goodbeta.cliente.ui.viewmodel.FeedbackViewModel

class FeedbackActivity : AppCompatActivity(R.layout.feedback_activity) {

    private lateinit var feedbackBinding: FeedbackActivityBinding
    private lateinit var feedbackViewModel: FeedbackViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        feedbackBinding = DataBindingUtil.setContentView(this, R.layout.feedback_activity)
        feedbackViewModel = ViewModelProvider(this).get(FeedbackViewModel::class.java)
        feedbackBinding.lifecycleOwner = this
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
}