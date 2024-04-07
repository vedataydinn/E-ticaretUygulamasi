package com.vedat.e_commerce.fragments.loginRegister

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.vedat.e_commerce.R
import com.vedat.e_commerce.data.User
import com.vedat.e_commerce.databinding.FragmentRegisterBinding
import com.vedat.e_commerce.util.Resource
import com.vedat.e_commerce.viewmodel.RegisterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

private  val TAG ="RegisterFragment"
@AndroidEntryPoint
class RegisterFragment: Fragment()
{

    private lateinit var binding:FragmentRegisterBinding
    private val viewModel by viewModels<RegisterViewModel> ()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            buttonRegisterRegister.setOnClickListener {
                val user = User(
                    edFirstNameRegister.text.toString().trim(),
                    edLastNameRegister.text.toString().trim(),
                    edEmailRegister.text.toString().trim()
                )
                val password =edPasswordRegister.text.toString()
                viewModel.createAccountWithEmailAndPassword(user , password )
            }
        }
        lifecycleScope.launchWhenCreated {
            viewModel.register.collect{
                when(it){
                    is Resource.Loading ->{
                        binding.buttonRegisterRegister.startAnimation()


                    }
                    is Resource.Success -> {
                        Log.d("test",it.data.toString())
                        binding.buttonRegisterRegister.revertAnimation()
                    }
                    is Resource.Error ->{
                        Log.e(TAG,it.message.toString())
                        binding.buttonRegisterRegister.revertAnimation()
                    }
                    else -> Unit
                }
            }
        }
    }
}