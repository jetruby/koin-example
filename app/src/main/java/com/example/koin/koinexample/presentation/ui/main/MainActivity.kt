package com.example.koin.koinexample.presentation.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.koin.koinexample.R
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mainPresenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_get_token).setOnClickListener {
            findViewById<TextView>(R.id.tv_token).text = mainPresenter.getToken()
        }
    }
}
