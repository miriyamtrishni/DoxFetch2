package com.example.doxfetch

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.doxfetch.R

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_home)

        val imageButton26 = findViewById<ImageButton>(R.id.imageButton26)
        val imageButton57 = findViewById<ImageButton>(R.id.imageButton57)

        imageButton26.setOnClickListener {
            // Navigate to NotificationActivity (or whatever activity you want)
            val intent = Intent(this, Notification::class.java)
            startActivity(intent)
        }

        imageButton57.setOnClickListener {
            // Navigate to ProfileActivity (or whatever activity you want)
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)

        button9.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener {
            // Navigate back to HomeActivity
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }


    }
}
