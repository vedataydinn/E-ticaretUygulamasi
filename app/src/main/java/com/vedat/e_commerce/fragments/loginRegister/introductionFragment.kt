package com.vedat.e_commerce.fragments.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vedat.e_commerce.R
import com.vedat.e_commerce.databinding.FragmentIntoductionBinding
import java.util.zip.Inflater

class introductionFragment: Fragment(R.layout.fragment_intoduction)
{
    private  lateinit var binding:FragmentIntoductionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container:ViewGroup?,
        savedInstanceState:Bundle?
    ): View?{
        binding = FragmentIntoductionBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view:View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnclickListener{
            findNavController().navigate(R.id.action_introductionFragment_to_accountOptionsFragment)
        }
    }
}