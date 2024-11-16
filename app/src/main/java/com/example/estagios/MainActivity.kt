package com.example.estagios

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
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
            openActivity(ESE::class.java)
        }

        buttonESA.setOnClickListener {
            openActivity(ESAA::class.java)
        }

        buttonESTG.setOnClickListener {
            openActivity(ESTG::class.java)
        }

        buttonESS.setOnClickListener {
            openActivity(ESS::class.java)
        }

        buttonESCE.setOnClickListener {
            openActivity(ESCE::class.java)
        }

        buttonESDL.setOnClickListener {
            openActivity(ESDL::class.java)
        }
    }

    // Função para abrir a Activity passada como parâmetro
    private fun openActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
