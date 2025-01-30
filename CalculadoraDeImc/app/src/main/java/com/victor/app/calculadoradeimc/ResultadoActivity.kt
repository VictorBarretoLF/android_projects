package com.victor.app.calculadoradeimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    private lateinit var btnVoltar: Button
    private lateinit var textPeso: TextView
    private lateinit var textAltura: TextView
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        btnVoltar = findViewById(R.id.btnVoltar)
        textPeso = findViewById(R.id.textPeso)
        textAltura = findViewById(R.id.textAltura)
        textResultado = findViewById(R.id.textResultado)

        val bundle = intent.extras
        if (bundle != null) {
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            textPeso.text = "Peso informado: $peso kg"
            textAltura.text = "Altura informada: $altura m"

            val imc = peso / (altura * altura)

            val resultado = if (imc < 18.5) {
                "IMC: $imc - Abaixo do peso"
            } else if (imc < 24.9) {
                "IMC: $imc - Peso normal"
            } else if (imc < 29.9) {
                "IMC: $imc - Sobrepeso"
            } else if (imc < 34.9) {
                "IMC: $imc - Obesidade grau 1"
            } else if (imc < 39.9) {
                "IMC: $imc - Obesidade grau 2"
            } else {
                "IMC: $imc - Obesidade grau 3"
            }

            textResultado.text = resultado
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}