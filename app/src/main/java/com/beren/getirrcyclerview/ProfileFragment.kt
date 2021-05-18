package com.beren.getirrcyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       val design = inflater.inflate(R.layout.fragment_profile, container, false)
        design.toolbarProfilePage.title=""

        (activity as AppCompatActivity).setSupportActionBar(design.toolbarProfilePage)
        return design
    }


    }
