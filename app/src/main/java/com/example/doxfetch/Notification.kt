package com.example.doxfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val button52 = findViewById<Button>(R.id.button52)

        button52.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val imageButton53 = findViewById<ImageButton>(R.id.imageButton53)

        imageButton53.setOnClickListener {
            // Navigate to NotificationActivity (or whatever activity you want)
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
