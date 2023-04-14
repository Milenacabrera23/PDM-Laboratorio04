package com.example.laboratorio04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var editTextNombre: EditText
    private lateinit var editTextCore: EditText
    private lateinit var editTextNumero: EditText
    private lateinit var buttonGuardar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNombre = findViewById(R.id.editTextNombre)
        editTextCore = findViewById(R.id.editTextCorreo)
        editTextNumero = findViewById(R.id.editTextNumero)
        buttonGuardar = findViewById(R.id.buttonGuardar)

        buttonGuardar.setOnClickListener {
            val name = editTextNombre.text.toString()
            val email = editTextCore.text.toString()
            val phone = editTextNumero.text.toString()

            val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("Nombre", name)
                intent.putExtra("Correo", email)
                intent.putExtra("Número", phone)
                startActivity(intent)
        }
    }
}


