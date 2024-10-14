package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cart)

        val backArrow = findViewById<ImageView>(R.id.back_Arrow)

        backArrow.setOnClickListener {
            navigateBackToMenuPage("Menu")
        }

        val OrderButton: Button = findViewById(R.id.Order)

        OrderButton.setOnClickListener {
            navigateBackToLocationPage("Location")
        }

    }

    private fun navigateBackToMenuPage(s: String) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }

    private fun navigateBackToLocationPage(s: String) {
        val intent = Intent(this, Location::class.java)
        startActivity(intent)
    }


}