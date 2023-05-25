package com.example.matheusoliveira_rm88430

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.matheusoliveira_rm88430.databinding.FragmentAcertou2Binding

class Acertou2Fragment : Fragment() {

    lateinit var bind : FragmentAcertou2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acertou2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentAcertou2Binding.bind(view)

        bind.btnProxima.setOnClickListener {
            findNavController().navigate(R.id.action_acertou2Fragment_to_questao03Fragment)
        }
    }

}