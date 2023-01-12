package com.example.lr5navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [uncoolFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class uncoolFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uncool, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = view.findViewById<TextView>(R.id.textName)
        tv.text = "Dear "+arguments?.getString("name")+" , we are deeply sorry"
        val bundle = bundleOf("coolness" to false)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(R.id.action_uncoolFragment_to_FirstFragment)
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(R.id.action_uncoolFragment_to_secondActivity,bundle)
        }
    }
}