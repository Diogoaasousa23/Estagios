package com.example.estagios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.adapter.LineAdapter
import com.example.estagios.dataclass.Estagio

class ESS : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estg)

        // Criar lista de estágios
        val listaEstagios = listOf(
            Estagio("Enfermagem", "Hospital Santa Luzia", "Viana do Castelo"),
            Estagio("Enfermagem", "Clínica de Saúde Familiar", "Ponte de Lima"),
            Estagio("Enfermagem", "Unidade Local de Saúde do Alto Minho", "Monção"),
            Estagio("Enfermagem", "Centro de Saúde de Caminha", "Caminha"),
            Estagio("Enfermagem", "Hospital Particular do Minho", "Braga"),
            Estagio("Enfermagem", "Centro de Cuidados Continuados", "Viana do Castelo"),
            Estagio("Enfermagem", "Lar de Idosos São Francisco", "Valença"),
            Estagio("Enfermagem", "Clínica Médica Sorriso", "Arcos de Valdevez"),
            Estagio("Enfermagem", "Unidade de Saúde Pública de Melgaço", "Melgaço"),
            Estagio("Enfermagem", "Centro de Reabilitação do Norte", "Vila Nova de Gaia")
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LineAdapter(listaEstagios)
    }
}