package com.dgb.appfrases.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.dgb.appfrases.R
import com.dgb.appfrases.data.model.QuoteModel
import com.dgb.appfrases.ui.viewholder.QuotesViewHolder

class QuoteAdapter (private val mDataSet: ArrayList<QuoteModel>,  //dataset with array of numbers
                     private val onClickListener: (QuoteModel) -> Unit) // onclick event
    : RecyclerView.Adapter<QuotesViewHolder>() {

    // El layout manager invoca este método para renderizar cada elemento
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_quote, parent, false) as ConstraintLayout
        return QuotesViewHolder(v, parent.context)
    }

    // Este método asigna valores para cada elemento de la lista
    override fun onBindViewHolder(holder: QuotesViewHolder, position: Int) {
        val item = mDataSet[position]
        holder.render(item, onClickListener)
    }

    // Cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejm, si implementamos filtros o búsquedas)
    override fun getItemCount() = mDataSet.size
}