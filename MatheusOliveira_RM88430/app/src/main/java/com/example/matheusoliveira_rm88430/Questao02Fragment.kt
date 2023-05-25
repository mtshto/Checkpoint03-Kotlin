package com.example.matheusoliveira_rm88430

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.matheusoliveira_rm88430.databinding.FragmentQuestao02Binding

class Questao02Fragment : Fragment() {

    lateinit var bind: FragmentQuestao02Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questao02, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind = FragmentQuestao02Binding.bind(view)

        val questao = Classe2(
            "Quem marcou o gol da final\n da libertadores de 2021?", mutableListOf(
                Classe1("Pitico Pereira", false),
                Classe1("Deyvin", true),
                Classe1("Lucas Lima", false),
                Classe1("Marinho", false)
            )
        )

        val textViewQuestao = view.findViewById<TextView>(R.id.pergunta01)
        textViewQuestao.text = questao.questao

        val alternativa01 = view.findViewById<TextView>(R.id.alternativa01)
        alternativa01.text = questao.alternativas[0].alternativa

        val alternativa02 = view.findViewById<TextView>(R.id.alternativa02)
        alternativa02.text = questao.alternativas[1].alternativa

        val alternativa03 = view.findViewById<TextView>(R.id.alternativa03)
        alternativa03.text = questao.alternativas[2].alternativa

        val alternativa04 = view.findViewById<TextView>(R.id.alternativa04)
        alternativa04.text = questao.alternativas[3].alternativa

        bind.btnVerificar.setOnClickListener {
            val selectedRadioButtonId = bind.radioGroup.checkedRadioButtonId

            if (selectedRadioButtonId != -1) {
                val selectedRadioButton =
                    bind.radioGroup.findViewById<RadioButton>(selectedRadioButtonId)
                val selectedIndex = bind.radioGroup.indexOfChild(selectedRadioButton)

                if (questao.alternativas[selectedIndex].correta) {
                    findNavController().navigate(R.id.acertou2Fragment)
                } else {
                    findNavController().navigate(R.id.errou2Fragment)
                }
            } else {
            }

        }


    }
}