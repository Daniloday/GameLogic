package com.missclick.gamelogic.ui.engine.three

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.missclick.gamelogic.R
import com.missclick.gamelogic.ui.finall.FinalFragment

class ThreeFragment : Fragment() {

    companion object {
        fun newInstance() = ThreeFragment()
    }

    private lateinit var viewModel: ThreeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ThreeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ans1 = view.findViewById<Button>(R.id.ans31)
        val ans2 = view.findViewById<Button>(R.id.ans32)
        val ans3 = view.findViewById<Button>(R.id.ans33)
        val hint = view.findViewById<TextView>(R.id.textView33)
        hint.setOnClickListener {
            viewModel.saveFOP()
        }
        ans1.setOnClickListener {
            findNavController().navigate(R.id.nav_final, FinalFragment.newInstance(win = false))
        }
        ans2.setOnClickListener {
            findNavController().navigate(R.id.nav_final, FinalFragment.newInstance(win = true))
        }
        ans3.setOnClickListener {
            findNavController().navigate(R.id.nav_final, FinalFragment.newInstance(win = false))
        }

    }

}