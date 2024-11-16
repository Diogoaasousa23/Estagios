package com.example.estagios.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.estagios.R
import com.example.estagios.dataclass.Estagio

class LineAdapter(private val lista: List<Estagio>) :
    RecyclerView.Adapter<LineAdapter.LineViewHolder>() {

    // ViewHolder para armazenar referências ao layout dos itens
    class LineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val curso: TextView = itemView.findViewById(R.id.curso)
        val empresa: TextView = itemView.findViewById(R.id.empresa)
        val local: TextView = itemView.findViewById(R.id.local)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerline, parent, false)
        return LineViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val currentItem = lista[position]
        holder.curso.text = currentItem.curso
        holder.empresa.text = currentItem.empresa
        holder.local.text = currentItem.local
    }

    override fun getItemCount() = lista.size
}
