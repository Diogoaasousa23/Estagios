package com.example.estagios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.adapter.LineAdapter
import com.example.estagios.dataclass.Estagio

class ESE : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estg)

        // Criar lista de estágios
        val listaEstagios = listOf(
            Estagio("Artes e Cinema Digital", "RTP - Rádio e Televisão de Portugal", "Lisboa"),
            Estagio("Artes e Cinema Digital", "Clap Filmes", "Porto"),
            Estagio("Artes Plásticas e Tecnologias da Arte", "Fundação Serralves", "Porto"),
            Estagio("Artes Plásticas e Tecnologias da Arte", "Museu Nacional de Arte Contemporânea (MNAC)", "Lisboa"),
            Estagio("Educação Básica", "Escola Primária de Viana do Castelo", "Viana do Castelo"),
            Estagio("Educação Básica", "Agrupamento de Escolas de Braga", "Braga"),
            Estagio("Educação Social Gerontológica", "Santa Casa da Misericórdia de Lisboa", "Lisboa"),
            Estagio("Educação Social Gerontológica", "Lar de Idosos da Cruz Vermelha", "Porto"),
            Estagio("Educação Básica", "Escola Básica de Caminha", "Caminha"),
            Estagio("Educação Social Gerontológica", "Associação de Apoio a Idosos de Viana do Castelo", "Viana do Castelo")
            )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LineAdapter(listaEstagios)
    }
}
