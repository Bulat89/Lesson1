package com.example.lesson1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.lesson1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button =  findViewById<Button>(R.id.ButtonClick)
        button.setOnClickListener {
            (it as Button).text = "Hellow"
        }

    }




}