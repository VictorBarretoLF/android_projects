package com.victor.app.aulaactivityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbrir = findViewById(R.id.btn_abrir_nova_tela)

        btnAbrir.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            this.startActivity(intent)
        }
    }
}