package com.example.doxfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            // Navigate to RegisterActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}

