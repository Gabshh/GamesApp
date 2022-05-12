package com.example.gameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val pesquisaEditText = findViewById<EditText>(R.id.pesquisaEditText)

        val intent: Intent = getIntent()

        val pesquisaText = intent.getStringExtra("pesquisa")

        pesquisaEditText.setText(pesquisaText)
//            intent.getStringExtra("pesquisa")

    }
}