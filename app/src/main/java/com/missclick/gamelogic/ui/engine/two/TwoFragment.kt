package com.missclick.gamelogic.ui.engine.two

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.missclick.gamelogic.R
import com.missclick.gamelogic.ui.finall.FinalFragment

class TwoFragment : Fragment() {

    companion object {
        fun newInstance() = TwoFragment()
    }

    private lateinit var viewModel: TwoViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.two_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TwoViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ans1 = view.findViewById<Button>(R.id.ans21)
        val ans2 = view.findViewById<Button>(R.id.ans22)
        val ans3 = view.findViewById<Button>(R.id.ans23)
        ans1.setOnClickListener {
            findNavController().navigate(R.id.nav_three)
        }
        ans2.setOnClickListener {
            findNavController().navigate(R.id.nav_final, FinalFragment.newInstance(win = false))
        }
        ans3.setOnClickListener {
            findNavController().navigate(R.id.nav_final, FinalFragment.newInstance(win = false))
        }

    }

}