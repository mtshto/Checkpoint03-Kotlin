package com.example.matheusoliveira_rm88430

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.matheusoliveira_rm88430.databinding.FragmentAcertou3Binding


class Acertou3Fragment : Fragment() {

    lateinit var bind: FragmentAcertou3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acertou3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentAcertou3Binding.bind(view)

        val imageView: ImageView = view.findViewById(R.id.Fernando)
        Glide.with(this).load(R.drawable.fernandoprass).into(imageView)

        bind.btnProxima.setOnClickListener {
            findNavController().navigate(R.id.action_acertou3Fragment_to_endFragment)
        }
    }


}