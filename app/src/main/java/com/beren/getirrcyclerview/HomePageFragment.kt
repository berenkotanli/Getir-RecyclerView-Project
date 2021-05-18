package com.beren.getirrcyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.beren.getirrcyclerview.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {
    private lateinit var design: FragmentHomePageBinding
    private lateinit var productList: ArrayList<Products>
    private lateinit var adapter: ProductsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_home_page, container, false)
        design.rcyclerViewProduct.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
       // design.toolbarHomePage.setLogo(R.drawable.getirlogo)
       design.toolbarHomePage.title=""

        (activity as AppCompatActivity).setSupportActionBar(design.toolbarHomePage)

      /*  val p1 = Products(1,"Yeni Ürünler", "newproducts",7.99)
        val p2 = Products(2,"İndirimler", "newproducts",7.99)
        val p3 = Products(3,"Su & İçecek", "newproducts",7.99)
        val p4 = Products(4,"Meyve & Sebze", "newproducts",7.99)
        val p5 = Products(5,"Fırından", "newproducts",7.99)
        val p6 = Products(6,"Temel Gıda", "newproducts",7.99)
        val p7 = Products(7,"Atıştırmalık", "newproducts",7.99)
        val p8 = Products(8,"Dondurma", "newproducts",7.99)
        val p9 = Products(9,"Yiyecek", "newproducts",7.99)
        val p10 = Products(10,"Süt & Kahvaltı", "newproducts",7.99)
        val p11 = Products(11,"Fit & Form", "newproducts",7.99)
        val p12 = Products(12,"Kişisel Bakım", "newproducts",7.99)
        val p13 = Products(13,"Ev Bakım", "newproducts",7.99)
        val p14 = Products(14,"Ev & Yaşam", "newproducts",7.99)
        val p15 = Products(15,"Teknoloji", "newproducts",7.99)
        val p16 = Products(16,"Evcil Hayvan", "newproducts",7.99)
        val p17 = Products(17,"Bebek", "newproducts",7.99)
        val p18 = Products(18,"Cinsel Sağlık", "newproducts",7.99)
        val p19 = Products(19,"Giyim", "newproducts",7.99)*/
        val p1 = Products(1,"Yeni Ürünler", "newproducts",7.99)
        val p2 = Products(2,"İndirimler", "discounts",7.99)
        val p3 = Products(3,"Su & İçecek", "waterdrinks",7.99)
        val p4 = Products(4,"Meyve & Sebze", "fruitsveggies",7.99)
        val p5 = Products(5,"Fırından", "pastry",7.99)
        val p6 = Products(6,"Temel Gıda", "basics",7.99)
        val p7 = Products(7,"Atıştırmalık", "snacks",7.99)
        val p8 = Products(8,"Dondurma", "icecream",7.99)
        val p9 = Products(9,"Yiyecek", "food",7.99)
        val p10 = Products(10,"Süt & Kahvaltı", "breakfast",7.99)
        val p11 = Products(11,"Fit & Form", "fitform",7.99)
        val p12 = Products(12,"Kişisel Bakım", "personalcare",7.99)
        val p13 = Products(13,"Ev Bakım", "homecare",7.99)
        val p14 = Products(14,"Ev & Yaşam", "homelife",7.99)
        val p15 = Products(15,"Teknoloji", "tech",7.99)
        val p16 = Products(16,"Evcil Hayvan", "pets",7.99)
        val p17 = Products(17,"Bebek", "baby",7.99)
        val p18 = Products(18,"Cinsel Sağlık", "sexualhealth",7.99)
        val p19 = Products(19,"Giyim", "clothing",7.99)

        productList = ArrayList()
        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)
        productList.add(p6)
        productList.add(p7)
        productList.add(p8)
        productList.add(p9)
        productList.add(p10)
        productList.add(p11)
        productList.add(p12)
        productList.add(p13)
        productList.add(p14)
        productList.add(p15)
        productList.add(p16)
        productList.add(p17)
        productList.add(p18)
        productList.add(p19)

        adapter = ProductsAdapter(requireContext(),productList)
        design.rcyclerViewProduct.adapter = adapter

        return design.root
    }


}