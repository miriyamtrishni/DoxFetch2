package com.example.doxfetch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            // Navigate to RegisterActivity
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Navigate to LoginActivity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}
