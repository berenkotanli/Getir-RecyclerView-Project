package com.beren.getirrcyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.beren.getirrcyclerview.databinding.FragmentDetailsPageBinding


class DetailsPageFragment : Fragment() {
private lateinit var design: FragmentDetailsPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_details_page, container, false)

        val bundle: DetailsPageFragmentArgs by navArgs()
        val comingProduct=bundle.productObject

        design.imageViewDetailsImage.setImageResource(
                resources.getIdentifier(comingProduct.product_image_name, "drawable", requireContext().packageName))
        design.textViewProductTitle.text=comingProduct.product_name

        return design.root
    }

    }
