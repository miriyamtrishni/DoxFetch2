package com.example.doxfetch;

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.doxfetch.R
import com.example.doxfetch.Welcome


class MainActivity : AppCompatActivity() {
    private val delayMillis: Long = 2000 // 2 seconds delay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Start MainActivity2 after a delay */
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Welcome::class.java))
            finish() // Optional: Finish MainActivity to prevent going back to it when pressing back button
        }, delayMillis)
    }
}









