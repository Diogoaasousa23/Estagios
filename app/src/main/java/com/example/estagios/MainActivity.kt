package com.example.estagios

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referência aos botões de imagem
        val buttonESE: ImageButton = findViewById(R.id.button_ese)
        val buttonESA: ImageButton = findViewById(R.id.button_esa)
        val buttonESTG: ImageButton = findViewById(R.id.button_estg)
        val buttonESS: ImageButton = findViewById(R.id.button_ess)
        val buttonESCE: ImageButton = findViewById(R.id.button_esce)
        val buttonESDL: ImageButton = findViewById(R.id.button_esdl)

        // Configuração do clique nos botões
        buttonESE.setOnClickListener {
            showToast("Você escolheu a ESE")
        }

        buttonESA.setOnClickListener {
            showToast("Você escolheu a ESA")
        }

        buttonESTG.setOnClickListener {
            showToast("Você escolheu a ESTG")
        }

        buttonESS.setOnClickListener {
            showToast("Você escolheu a ESS")
        }

        buttonESCE.setOnClickListener {
            showToast("Você escolheu a ESCE")
        }

        buttonESDL.setOnClickListener {
            showToast("Você escolheu a ESDL")
        }
    }

    // Função para exibir um Toast simples com a mensagem
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
