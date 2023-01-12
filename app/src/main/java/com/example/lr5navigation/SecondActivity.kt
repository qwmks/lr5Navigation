package com.example.lr5navigation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tv: TextView = findViewById(R.id.textViewAmount)
        tv.setText("Things you didnt know before")
    }
}