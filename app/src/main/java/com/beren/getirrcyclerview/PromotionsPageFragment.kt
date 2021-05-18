package com.beren.getirrcyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.beren.getirrcyclerview.databinding.FragmentPromotionsPageBinding

class PromotionsPageFragment : Fragment() {
    private lateinit var design:FragmentPromotionsPageBinding
    private lateinit var promotionsList: ArrayList<Promotions>
    private lateinit var adapter:PromotionsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_promotions_page, container, false)

        design.rvPromotions.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val prom1=Promotions(1,"Kampanyadan yararlanmak için 120 TL minimum sepet tutarını geçmeniz gerekir","Size özel 20 TL hediye!","prom_one")
        val prom2=Promotions(2,"Size özel, 60 TL ve üzeri siparişlerinize 20 TL indirim uygulanır.","Size özel 20 TL hediye!","prom_two")
        val prom3=Promotions(3,"Kampanyadan faydalanmak için sepetinize dilediğiniz Le Petit Marseillais duş jeli veya sabun ürününü eklemelisiniz.","Le Petit Marseillais duş jelleri ve sabunlarda %40 indirim!","prom_three")
        val prom4=Promotions(4,"Kampanyadan faydalanmak için Sütaş Labne Peynir ürününü sepetinize eklemelisiniz.","Haftanın mor ürünü - Sütaş","prom_four")

        promotionsList= ArrayList()
        promotionsList.add(prom1)
        promotionsList.add(prom2)
        promotionsList.add(prom3)
        promotionsList.add(prom4)

        adapter= PromotionsAdapter(requireContext(), promotionsList)
        design.rvPromotions.adapter=adapter

        design.toolbarPromotionPage.title=""

        (activity as AppCompatActivity).setSupportActionBar(design.toolbarPromotionPage)
        return design.root
    }


}