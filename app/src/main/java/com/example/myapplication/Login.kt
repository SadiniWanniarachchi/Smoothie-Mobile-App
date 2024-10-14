package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Find the Login button by its ID
        val loginButton: Button = findViewById(R.id.Login_Button)

        loginButton.setOnClickListener {
            // Create an Intent to navigate to the Home activity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


        }
    }