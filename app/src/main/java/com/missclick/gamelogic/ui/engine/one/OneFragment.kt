package com.missclick.gamelogic.ui.engine.one

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.missclick.gamelogic.R
import com.missclick.gamelogic.ui.finall.FinalFragment

class OneFragment : Fragment() {

    private lateinit var oneViewModel: OneViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        oneViewModel =
                ViewModelProvider(this).get(OneViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_one, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
        oneViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ans1 = view.findViewById<Button>(R.id.ans1)
        val ans2 = view.findViewById<Button>(R.id.ans2)
        val ans3 = view.findViewById<Button>(R.id.ans3)
        ans1.setOnClickListener {
            findNavController().navigate(R.id.nav_final,FinalFragment.newInstance(win = false))
        }
        ans2.setOnClickListener {
            findNavController().navigate(R.id.nav_final,FinalFragment.newInstance(win = false))
        }
        ans3.setOnClickListener {
            findNavController().navigate(R.id.nav_two)
        }

    }
}