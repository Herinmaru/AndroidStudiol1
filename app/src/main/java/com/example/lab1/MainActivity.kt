package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val displayButton: Button  = findViewById(R.id.button)
        displayButton.setOnClickListener {
            val displayView: TextView =  findViewById(R.id.textView)
            displayView.text = "Hello world!"

        }

    }
}