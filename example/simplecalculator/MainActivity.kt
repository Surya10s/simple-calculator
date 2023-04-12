package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress"NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btn:Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity((intent))
        }
    }
}