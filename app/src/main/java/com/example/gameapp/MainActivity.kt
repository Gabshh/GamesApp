package com.example.gameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

lateinit var pesquisaEditText: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pesquisaEditText = findViewById<EditText>(R.id.pesquisaEditText)

        val pesquisarBtn = findViewById<ImageButton>(R.id.pesquisarBtn)

        pesquisarBtn.setOnClickListener{
            val pesquisa = pesquisaEditText.text.toString()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("pesquisa", pesquisa)
            startActivity(intent)
        }

    }
}