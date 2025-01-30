package com.victor.app.passarobjetosentreactivities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.victor.app.passandodadosentreactivities.dto.Filme

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
            val hasApiLevel33OrHigher = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

            val filme = if (hasApiLevel33OrHigher) {
//                bundle.getParcelable<Filme>("filme")
                bundle.getParcelable("filme", Filme::class.java)
            } else {
//                bundle.getSerializable("filme") as Filme
                bundle.getSerializable("filme") as Filme
            }

            val resultado = "Filme: ${filme?.distribuidor}"

            textFilme.text = resultado
        }

        buttonFechar.setOnClickListener {
            finish()
        }
    }
}