package com.example.doxfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)



        val button7 = findViewById<Button>(R.id.button7)

        button7.setOnClickListener {
            // Navigate to RegisterActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}