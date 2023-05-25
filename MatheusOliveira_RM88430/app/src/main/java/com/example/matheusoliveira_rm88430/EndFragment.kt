package com.example.matheusoliveira_rm88430

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.matheusoliveira_rm88430.databinding.FragmentEndBinding

class EndFragment : Fragment() {

    lateinit var bind : FragmentEndBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_end, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentEndBinding.bind(view)

        bind.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_endFragment_to_homeFragment)
        }
    }

}