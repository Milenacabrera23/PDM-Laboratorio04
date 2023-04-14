package com.example.laboratorio04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    private lateinit var textViewNombre: TextView
    private lateinit var textViewCorreo: TextView
    private lateinit var textViewNumero: TextView
    private lateinit var buttonCompartir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textViewNombre = findViewById(R.id.textViewNombre)
        textViewCorreo = findViewById(R.id.textViewCorreo)
        textViewNumero = findViewById(R.id.textViewNumero)

        val intent = intent
        val name = intent.getStringExtra("Nombre").toString()
        val email = intent.getStringExtra("Correo").toString()
        val phone = intent.getStringExtra("Número").toString()

        textViewNombre.text = name
        textViewCorreo.text = email
        textViewNumero.text = phone


        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, null)

        startActivity(shareIntent)

    }
}

