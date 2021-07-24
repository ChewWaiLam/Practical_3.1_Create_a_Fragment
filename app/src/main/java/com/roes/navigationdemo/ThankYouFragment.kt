package com.roes.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ThankYouFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_thank_you, container, false)

        val FinalResult : TextView = view.findViewById(R.id.txtResult)

        val args = ThankYouFragmentArgs.fromBundle(requireArguments())

        //FinalResult.text = "Your Score : " + String.format("%.wf", args.totalScore) + "%"
        FinalResult.text = "Your Score : " + String.format("%.2f", args.totalScore) + "%"
        //FinalResult.text = args.totalScore.toString()

        return view
    }


}