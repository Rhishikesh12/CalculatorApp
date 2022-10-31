package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var tvInput : TextView? = null
    var lastNumeric : Boolean = false
    var lastDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)

    }

    fun btnClicked(view: View){
        tvInput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    fun btnClear(view: View){
        tvInput?.text = " "
    }

    fun dotOperator(view: View){
        if(lastNumeric && !lastDot){
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}