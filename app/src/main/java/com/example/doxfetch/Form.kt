package com.example.doxfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val button61 = findViewById<Button>(R.id.button61)

        button61.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}