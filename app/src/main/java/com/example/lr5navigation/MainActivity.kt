package com.example.lr5navigation


import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer

import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val viewModel: FragViewModel by viewModels()
    lateinit var fab:FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fm:FragmentManager = supportFragmentManager
        setContentView(R.layout.activity_main)
        Log.d("ModelTest",viewModel.selectedItem.toString())
        viewModel.selectedItem.observe(this, { item ->
            if (viewModel.selectedItem.value == true)
                fab.hide()
            else
                fab.show()
        })
        fab = findViewById(R.id.fab)
        Log.d("currentFrag", findNavController(R.id.fragment).currentDestination?.label.toString())
        fab.setOnClickListener { view ->
            val navController = findNavController(R.id.fragment)
            navController.navigateUp()
            navController.navigate(R.id.action_global_FirstFragment)
        }
    }
}


