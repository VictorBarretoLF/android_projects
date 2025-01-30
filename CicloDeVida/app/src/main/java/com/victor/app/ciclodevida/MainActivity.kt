package com.victor.app.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var detalhesActivity: Button
    lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        detalhesActivity = findViewById(R.id.btn_go_to_detalhes)
        exitButton = findViewById(R.id.btn_sair)

        detalhesActivity.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de Vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de Vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de Vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de Vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de Vida", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo de Vida", "onRestart")
    }
}