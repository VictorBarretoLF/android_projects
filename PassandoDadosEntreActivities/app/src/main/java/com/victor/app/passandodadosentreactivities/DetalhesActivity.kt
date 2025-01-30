package com.victor.app.passandodadosentreactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.btn_voltar)
        textFilme = findViewById(R.id.textFilme)

        val bundle = intent.extras // todos os parâmetros

        if (bundle != null) {
            val filme = bundle.getString("filme")
            val classificacao = bundle.getInt("classificacao")
            val avaliacos = bundle.getDouble("avaliacos")

            val resultado = "Filme: $filme - class. $classificacao aval. $avaliacos"

            textFilme.text = resultado
        }

        buttonFechar.setOnClickListener {
            finish()
        }
    }
}