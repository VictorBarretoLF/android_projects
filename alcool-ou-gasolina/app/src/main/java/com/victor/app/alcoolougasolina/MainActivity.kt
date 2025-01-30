package com.victor.app.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputAlcool: TextInputLayout
    private lateinit var editAlcool: TextInputEditText

    private lateinit var textInputGasolina: TextInputLayout
    private lateinit var editGasolina: TextInputEditText

    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarComponentesInterface()
        btnCalcular.setOnClickListener {
            calcularMelhorPreco()
        }
    }

    private fun calcularMelhorPreco() {
        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()

        val resultadoValidacao = validarPrecoAlcoolComGasolina(precoAlcool, precoGasolina)

        if (resultadoValidacao) {
            val valorAlcool = precoAlcool.toDouble()
            val valorGasolina = precoGasolina.toDouble()

            val resultadoCalculo = valorAlcool / valorGasolina

            if (resultadoCalculo >= 0.7) {
                textResultado.text = "Melhor utilizar Gasolina"
            } else {
                textResultado.text = "Melhor utilizar Álcool"
            }
        }
    }

    private fun validarPrecoAlcoolComGasolina(precoAlcool: String, precoGasolina: String): Boolean {

        textInputAlcool.error = null
        textInputGasolina.error = null

        var isValid = true

        if (precoAlcool.isEmpty()) {
            textInputAlcool.error = "Digite o preço do álcool"
            println("FALSOOOOO PRA ALCOOL")
            isValid = false
        }

        if (precoGasolina.isEmpty()) {
            textInputGasolina.error = "Digite o preço da Gasolina"
            isValid = false
        }

        return isValid
    }

    private fun inicializarComponentesInterface() {
        textInputAlcool = findViewById(R.id.text_input_alcool)
        editAlcool = findViewById(R.id.edit_alcool)

        textInputGasolina = findViewById(R.id.text_input_gasolina)
        editGasolina = findViewById(R.id.edit_gasolina)

        btnCalcular = findViewById(R.id.btn_calcular)
        textResultado = findViewById(R.id.text_resultado)
    }
}