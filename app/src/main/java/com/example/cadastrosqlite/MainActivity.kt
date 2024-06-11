package com.example.cadastrosqlite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                val edtNome: EditText = findViewById(R.id.edtNome)
                val edtEndereco: EditText = findViewById(R.id.edtEndereco)
                val edtBairro: EditText = findViewById(R.id.edtBairro)
                val edtCep: EditText = findViewById(R.id.edtCep)
                val edtTel: EditText = findViewById(R.id.edtTel)

                val btnCadastro: Button = findViewById(R.id.btnCadastro)

            btnCadastro.setOnClickListener()
            {
                val intent = Intent(this, Resposta::class.java)
                intent.putExtra("nome", edtNome.text.toString())
                intent.putExtra("endereco", edtEndereco.text.toString())
                intent.putExtra("bairro", edtBairro.text.toString())
                intent.putExtra("cep", edtCep.text.toString())
                intent.putExtra("tel", edtTel.text.toString())

                startActivity(intent)
            }
        }
    }

    private fun setContent(function: @Composable () -> Unit) {
        TODO("Not yet implemented")
    }
}
