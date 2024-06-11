package com.example.cadastrosqlite

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastrosqlite.DB.DBHelper
import com.example.cadastrosqlite.R.*
import com.example.cadastrosqlite.R.id.*

class RespostaActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_resposta)
        val edtNome: EditText = findViewById(edtNome)
        val edtEndereco: EditText = findViewById(edtEndereco)
        val edtBairro: EditText = findViewById(edtBairro)
        val edtCep: EditText = findViewById(edtCep)
        val edtTel: EditText = findViewById(edtTel)
        val btnConfirmar: Button = findViewById(btnConfirmar)

        edtNome.setText(intent.getStringExtra("nome"))
        edtEndereco.setText(intent.getStringExtra("endereco"))
        edtBairro.setText(intent.getStringExtra("bairro"))
        edtCep.setText(intent.getStringExtra("cep"))
        edtTel.setText(intent.getStringExtra("tel"))

        val db = DBHelper(this, null)

        btnConfirmar.setOnClickListener{
            db.addPessoa(edtNome.text.toString(), edtEndereco.text.toString(), edtBairro.text.toString(), edtCep.text.toString(), edtTel.text.toString())
            finish()
        }
    }