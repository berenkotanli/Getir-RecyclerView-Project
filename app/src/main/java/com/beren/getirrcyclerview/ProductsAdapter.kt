package com.beren.getirrcyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.beren.getirrcyclerview.databinding.CardDesignBinding

class ProductsAdapter(var mContext:Context, var productsList:List<Products>)
    : RecyclerView.Adapter<ProductsAdapter.CardDesignHolder>(){
    inner class CardDesignHolder(cardDesignBinding: CardDesignBinding):RecyclerView.ViewHolder(cardDesignBinding.root){
        var design: CardDesignBinding
        init{
            this.design =cardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = CardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val product = productsList.get(position)
        holder.design.textViewProductName.text = product.product_name
        holder.design.imageViewProduct.setImageResource(

            mContext.resources.getIdentifier(product.product_image_name,"drawable",mContext.packageName))
        holder.design.productCard.setOnClickListener {
            val transition= HomePageFragmentDirections.productDetailsTransition(product)
            Navigation.findNavController(it).navigate(transition)
        }

    }

    override fun getItemCount(): Int {
       return productsList.size
    }
}