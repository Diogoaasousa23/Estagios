package com.example.estagios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.adapter.LineAdapter
import com.example.estagios.dataclass.Estagio

class ESA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estg)

        // Criar lista de estágios
        val listaEstagios = listOf(
            Estagio("Agronomia", "AgroGlobal", "Santarém"),
            Estagio("Agronomia", "Herdade do Esporão", "Reguengos de Monsaraz"),
            Estagio("Biotecnologia", "Instituto Nacional de Investigação Agrária e Veterinária (INIAV)", "Lisboa"),
            Estagio("Biotecnologia", "Biocant - Centro de Inovação em Biotecnologia", "Cantanhede"),
            Estagio("Enfermagem Veterinária", "Hospital Veterinário do Porto", "Porto"),
            Estagio("Enfermagem Veterinária", "Zoo Santo Inácio", "Vila Nova de Gaia"),
            Estagio("Engenharia do Ambiente", "Quercus - Associação Nacional de Conservação da Natureza", "Lisboa"),
            Estagio("Engenharia do Ambiente", "Agência Portuguesa do Ambiente (APA)", "Lisboa"),
            Estagio("Engenharia do Ambiente", "EDP Renováveis", "Lisboa"),
            Estagio("Biotecnologia", "Labfit - Health Products Research and Development", "Guimarães")
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LineAdapter(listaEstagios)
    }
}