package com.example.estagios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.adapter.LineAdapter
import com.example.estagios.dataclass.Estagio

class ESTG : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estg)

        // Criar lista de estágios
        val listaEstagios = listOf(
            Estagio("Engenharia Informática", "Altice Labs", "Braga"),
            Estagio("Engenharia Mecânica", "Continental Mabor", "Famalicão"),
            Estagio("Engenharia Mecatrónica", "Bosch Car Multimedia", "Braga"),
            Estagio("Design do Produto", "IKEA Industry", "Paços de Ferreira"),
            Estagio("Engenharia de Redes e Sistemas de Computadores", "NOS Comunicações", "Porto"),
            Estagio("Gastronomia e Artes Culinárias", "Restaurante Fortaleza do Guincho", "Cascais"),
            Estagio("Gestão", "Viana Marina", "Viana do Castelo"),
            Estagio("Engenharia Alimentar", "Frulact", "Maia"),
            Estagio("Turismo", "Pousadas de Portugal", "Viana do Castelo"),
            Estagio("Engenharia Civil e do Ambiente", "Águas do Norte", "Braga")
            )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LineAdapter(listaEstagios)
    }
}
