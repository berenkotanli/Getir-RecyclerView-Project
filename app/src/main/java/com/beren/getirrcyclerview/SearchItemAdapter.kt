package com.beren.getirrcyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.beren.getirrcyclerview.databinding.CardDesignBinding
import com.beren.getirrcyclerview.databinding.SearchItemCardDesignBinding
import com.google.android.material.snackbar.Snackbar

class SearchItemAdapter (var mContext: Context, var searchItemList:List<SearchItems>)
    : RecyclerView.Adapter<SearchItemAdapter.CardDesignHolder>(){
    inner class CardDesignHolder(cardDesignBinding: SearchItemCardDesignBinding): RecyclerView.ViewHolder(cardDesignBinding.root){
        var design: SearchItemCardDesignBinding
        init{
            this.design =cardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = SearchItemCardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val searchItem = searchItemList.get(position)
        holder.design.textViewSearchItem.text=searchItem.item_name
        holder.design.searchItemCardView.setOnClickListener {
            Snackbar.make(it,"${searchItem.item_name} aranıyor..", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return searchItemList.size
    }


}