package com.example.estagios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.adapter.LineAdapter
import com.example.estagios.dataclass.Estagio

class ESCE : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estg)

        // Criar lista de estágios
        val listaEstagios = listOf(
            Estagio("Contabilidade e Fiscalidade", "KPMG", "Lisboa"),
            Estagio("Contabilidade e Fiscalidade", "Deloitte", "Porto"),
            Estagio("Gestão da Distribuição e Logística", "CTT Expresso", "Lisboa"),
            Estagio("Gestão da Distribuição e Logística", "DHL Portugal", "Lisboa"),
            Estagio("Marketing e Comunicação Empresarial", "NOS Comunicações", "Lisboa"),
            Estagio("Marketing e Comunicação Empresarial", "Sonae MC", "Porto"),
            Estagio("Organização e Gestão Empresariais", "Galp Energia", "Lisboa"),
            Estagio("Organização e Gestão Empresariais", "EDP - Energias de Portugal", "Porto"),
            Estagio("Gestão da Distribuição e Logística", "Continente Logística", "Gaia"),
            Estagio("Marketing e Comunicação Empresarial", "Agência de Comunicação Lift", "Lisboa")
        )

        // Configurar RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LineAdapter(listaEstagios)
    }
}
