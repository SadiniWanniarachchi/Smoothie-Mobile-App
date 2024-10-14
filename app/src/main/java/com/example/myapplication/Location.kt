package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_location)

        val backArrow = findViewById<ImageView>(R.id.back_Arrow)

        backArrow.setOnClickListener {
            navigateBackToCartPage("Cart")
        }


    }

    private fun navigateBackToCartPage(s: String) {
        val intent = Intent(this, Cart::class.java)
        startActivity(intent)
    }
}