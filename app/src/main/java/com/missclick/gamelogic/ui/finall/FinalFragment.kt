package com.missclick.gamelogic.ui.finall

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

class FinalFragment : Fragment() {

    private lateinit var finalViewModel: FinalViewModel
    private var win : Boolean? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            win = it.getBoolean("win")
        }
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        finalViewModel =
                ViewModelProvider(this).get(FinalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_final, container, false)
//        val textView: TextView = root.findViewById(R.id.text_slideshow)
        finalViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.textResult)
        val res = view.findViewById<Button>(R.id.btn_rest)
        if (!win!!) text.text = "Lose"
        res.setOnClickListener {
            findNavController().navigate(R.id.nav_one)
        }
    }

    companion object {
        fun newInstance(win : Boolean):Bundle{
            return Bundle().apply {
                putBoolean("win", win)
            }
        }
    }
}