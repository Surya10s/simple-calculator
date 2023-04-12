package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val num1: EditText = findViewById(R.id.editTextNumber2)
        val num2: EditText = findViewById(R.id.editTextNumber3)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val rstbtn: Button = findViewById(R.id.button)
        val sol: TextView = findViewById(R.id.textView4)

        btn1.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x + y
            sol.text = res.toString()
        }
        btn2.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x - y
            sol.text = res.toString()
        }
        btn3.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x * y
            sol.text = res.toString()
        }
        btn4.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            if(y==0){
                Toast.makeText(this, "Invalid Inputs", Toast.LENGTH_SHORT).show()
            }
            else{
                val res = x / y
                sol.text = res.toString()
            }
        }
        rstbtn.setOnClickListener {
            num1.text = null
            num2.text = null
            sol.text = ""
        }
    }
}