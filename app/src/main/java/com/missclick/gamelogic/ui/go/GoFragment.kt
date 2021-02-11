package com.missclick.gamelogic.ui.go

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

class GoFragment : Fragment() {

    private lateinit var goViewModel: GoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        goViewModel =
                ViewModelProvider(this).get(GoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_go, container, false)
//        val textView: TextView = root.findViewById(R.id.text_gallery)
        goViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn1 = view.findViewById<Button>(R.id.btn_go)
        val btn2 = view.findViewById<Button>(R.id.btn_exit)
        btn1.setOnClickListener {
            findNavController().navigate(R.id.nav_one)
        }
        btn2.setOnClickListener {
            activity?.moveTaskToBack(true)
        }
    }
}