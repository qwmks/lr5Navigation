package com.example.lr5navigation

import android.content.ClipData
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    private val viewModel: FragViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Deposit",viewModel.selectedItem.toString())
        viewModel.selectItem(true)
        val name = view.findViewById<TextView>(R.id.editTextName)
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            Log.d("Content", name.text.toString())
            if (name.text.toString()=="Max"||name.text.toString()=="Maxim"||name.text.toString()=="Maks"||name.text.toString()=="Maksim"||name.text.toString()=="Ivan"||name.text.toString()=="Vanya"||
                    name.text.toString()=="Иван"||name.text.toString()=="Максим"||name.text.toString()=="Ваня"||name.text.toString()=="Макс"||name.text.toString()=="max"||name.text.toString()=="ivan") {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            } else {
                val bundle = bundleOf("name" to name.text.toString())
                findNavController().navigate(R.id.action_FirstFragment_to_uncoolFragment, bundle)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.selectItem(false)
    }

}