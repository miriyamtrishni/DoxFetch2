package com.example.doxfetch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val button32 = findViewById<Button>(R.id.button32)

        button32.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val imageButton35 = findViewById<ImageButton>(R.id.imageButton35)

        imageButton35.setOnClickListener {
            // Navigate to NotificationActivity (or whatever activity you want)
            val intent = Intent(this, Notification::class.java)
            startActivity(intent)
        }
    }
}