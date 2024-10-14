package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.content.Intent
import android.widget.Button
import android.widget.TextView

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen03)

        // Find the button by its ID
        val buttonGetStarted: Button = findViewById(R.id.Get_Started)

        // Set an OnClickListener on the button
        buttonGetStarted.setOnClickListener {
            // Create an Intent to start the next activity
            val intent = Intent(this, register::class.java)
            startActivity(intent)


            // Find the text by its ID
            val signInTextView: TextView = findViewById(R.id.textView2)

            // Set an OnClickListener on the "Sign In" TextView
            signInTextView.setOnClickListener {
                // Create an Intent to start the LoginActivity
                val intent = Intent(this, Login::class.java)
                startActivity(intent)


            }
        }
    }
}