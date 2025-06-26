package com.mari.task.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mari.task.R
import com.mari.task.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay


class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?//guarda estados do fragmenttodo estado da tela se armazena aq
    ): View{
        _binding= FragmentSplashBinding.inflate(inflater,container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({checkAuth()}, 3000)

    }
    private fun checkAuth(){
        findNavController().navigate(R.id.action_splashFragment_to_autentication)
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    }
