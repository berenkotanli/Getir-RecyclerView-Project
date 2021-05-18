package com.beren.getirrcyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.SearchViewBindingAdapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.beren.getirrcyclerview.databinding.FragmentSearchBinding
import kotlinx.android.synthetic.main.fragment_search.view.*


class SearchFragment : Fragment() {
    private lateinit var design: FragmentSearchBinding
    private lateinit var searchItemList: ArrayList<SearchItems>
    private lateinit var adapter: SearchItemAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_search, container, false)
        design.toolbarSearchPage.title=""

        (activity as AppCompatActivity).setSupportActionBar(design.toolbarSearchPage)
        //design.searchview.setQuery()
        //search.setQueryHint("Custom Search Hint");

        design.rvSearchItem.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val searchItem1= SearchItems("su")
        val searchItem2= SearchItems("dondurma")
        val searchItem3= SearchItems("süt")
        val searchItem4= SearchItems("ekmek")
        val searchItem5= SearchItems("yumurta")
        val searchItem6= SearchItems("yoğurt")
        val searchItem7= SearchItems("kahve")
        val searchItem8= SearchItems("peynir")
        val searchItem9= SearchItems("cips")

        searchItemList= ArrayList()
        searchItemList.add(searchItem1)
        searchItemList.add(searchItem2)
        searchItemList.add(searchItem3)
        searchItemList.add(searchItem4)
        searchItemList.add(searchItem5)
        searchItemList.add(searchItem6)
        searchItemList.add(searchItem7)
        searchItemList.add(searchItem8)
        searchItemList.add(searchItem9)

        adapter= SearchItemAdapter(requireContext(),searchItemList)
        design.rvSearchItem.adapter=adapter




        return design.root
    }

}