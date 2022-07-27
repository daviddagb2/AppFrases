package com.dgb.appfrases.ui.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dgb.appfrases.data.model.QuoteModel
import com.dgb.appfrases.databinding.ItemQuoteBinding

class QuotesViewHolder (view: View, context: Context) : RecyclerView.ViewHolder(view) {


    //Agregado mediante viewbinding
    val binding =  ItemQuoteBinding.bind(view)

    init {
        // Get reference via binding
        //btnNumber = binding.buttonNum
    }

    fun render(quote: QuoteModel, onClickListener: (QuoteModel) -> Unit){
        binding.txtquote.text = quote.phrase
        binding.txtautor.text = quote.name
        binding.viewroot.setOnClickListener{
            onClickListener(quote)
        }
    }
}