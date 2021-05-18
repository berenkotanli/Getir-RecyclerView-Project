package com.beren.getirrcyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beren.getirrcyclerview.databinding.PromotionCardBinding
import com.google.android.material.snackbar.Snackbar

class PromotionsAdapter(var mContext: Context, var promotionsList:List<Promotions>)
    : RecyclerView.Adapter<PromotionsAdapter.PromotionDesignHolder>() {
    inner class PromotionDesignHolder(promotionCardBinding: PromotionCardBinding):RecyclerView.ViewHolder(promotionCardBinding.root){
        var design: PromotionCardBinding
        init{
            this.design= promotionCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromotionDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = PromotionCardBinding.inflate(layoutInflater,parent,false)
        return PromotionDesignHolder(design)
    }

    override fun onBindViewHolder(holder: PromotionDesignHolder, position: Int) {
        val promotions=promotionsList.get(position)
        holder.design.textViewPromotionTitle.text=promotions.promotionTitle
        holder.design.textViewPromotionDetail.text=promotions.promotionDetail
        holder.design.imageViewPromotion.setImageResource(mContext.resources.getIdentifier(promotions.promotion_image_name,"drawable",mContext.packageName))
        holder.design.promotionsCardView.setOnClickListener {
            Snackbar.make(it,"Kampanya uygulandı",Snackbar.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
        return promotionsList.size
    }
}