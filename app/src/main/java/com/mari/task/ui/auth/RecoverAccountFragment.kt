package com.mari.task.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mari.task.R
import com.mari.task.databinding.FragmentRecoverAccountBinding
import com.mari.task.databinding.FragmentRegisterBinding

class RecoverAccountFragment : Fragment() {
    private var _binding: FragmentRecoverAccountBinding? =null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentRecoverAccountBinding.inflate(inflater,container,false)
        return binding.root

    }


    }