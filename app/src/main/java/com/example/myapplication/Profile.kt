package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val backArrow = findViewById<ImageView>(R.id.back_Arrow)

        backArrow.setOnClickListener {
            navigateBackToHomePage("Home")
        }

    }

    private fun navigateBackToHomePage(s: String) {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }

    }
