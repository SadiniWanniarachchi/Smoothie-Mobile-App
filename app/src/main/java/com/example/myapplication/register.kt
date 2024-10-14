package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)


            val registerButton: Button = findViewById(R.id.Sign_Up)

        registerButton.setOnClickListener {
            // Create an Intent to navigate to the Login
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        }

    }
