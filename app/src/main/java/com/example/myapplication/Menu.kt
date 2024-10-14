package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val backArrow = findViewById<ImageView>(R.id.back_Arrow)

        backArrow.setOnClickListener {
            navigateBackToCategoriesPage("Categories")
        }

        val Order: Button = findViewById(R.id.AddOrder)

        Order.setOnClickListener {
            navigateBackToCartPage("Cart")

        }

        }

    private fun navigateBackToCategoriesPage(s: String) {
        val intent = Intent(this, Categories::class.java)
        startActivity(intent)
    }



    private fun navigateBackToCartPage(s: String) {
        val intent = Intent(this, Cart::class.java)
        startActivity(intent)
    }

}
