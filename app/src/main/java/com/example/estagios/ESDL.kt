package com.example.estagios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.adapter.LineAdapter
import com.example.estagios.dataclass.Estagio

class ESDL : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estg)

        // Criar lista de estágios
        val listaEstagios = listOf(
            Estagio("Treino Desportivo", "Clube Desportivo de Viana", "Viana do Castelo"),
            Estagio("Gestão de Atividades de Lazer", "Parque Nacional Peneda-Gerês", "Melgaço"),
            Estagio("Reabilitação Física", "Centro de Saúde de Viana", "Viana do Castelo"),
            Estagio("Turismo Desportivo", "Porto e Norte Turismo", "Braga"),
            Estagio("Gestão de Equipamentos Desportivos", "Pavilhão Municipal de Caminha", "Caminha"),
            Estagio("Promoção de Atividade Física", "Ginásio FitUp", "Ponte de Lima"),
            Estagio("Desporto Escolar", "Agrupamento de Escolas de Arcos de Valdevez", "Arcos de Valdevez"),
            Estagio("Organização de Eventos Desportivos", "Run Porto", "Porto"),
            Estagio("Ciências do Desporto", "Centro de Investigação do IPVC", "Viana do Castelo"),
            Estagio("Desportos Radicais", "Nature4Adventure", "Paredes de Coura")
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LineAdapter(listaEstagios)
    }
}
