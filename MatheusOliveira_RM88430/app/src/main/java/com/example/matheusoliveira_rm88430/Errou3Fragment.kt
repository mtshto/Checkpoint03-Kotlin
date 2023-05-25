package com.example.matheusoliveira_rm88430

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.matheusoliveira_rm88430.databinding.FragmentErrou3Binding


class Errou3Fragment : Fragment() {

    lateinit var bind : FragmentErrou3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_errou3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentErrou3Binding.bind(view)

        bind.btnDnv2.setOnClickListener {
            findNavController().navigate(R.id.questao03Fragment)
        }

    }

}