package com.victor.app.passarobjetosentreactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.victor.app.passandodadosentreactivities.dto.Filme

class MainActivity : AppCompatActivity() {

    lateinit var detalhesActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        detalhesActivity = findViewById(R.id.btn_go_to_detalhes)

        detalhesActivity.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            val filme = Filme(
                "The Witcher",
                "Geralt de Rivia, um caçador de monstros solitário, luta para encontrar seu lugar em um mundo onde as pessoas muitas vezes se mostram mais perversas do que as bestas.",
                9.2,
                "Lauren Schmidt Hissrich",
                16,
                "Netflix"
            )

            intent.putExtra("filme", filme)

            startActivity(intent)
        }
    }
}