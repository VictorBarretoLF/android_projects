package com.victor.app.passandodadosentreactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var detalhesActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        detalhesActivity = findViewById(R.id.btn_go_to_detalhes)

        detalhesActivity.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            // Passar parâmetros para a próxima Activity
            intent.putExtra("filme", "The Witcher")
            intent.putExtra("classificacao", 5)
            intent.putExtra("avaliacos", 9.2)

            startActivity(intent)
        }
    }
}