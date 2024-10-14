package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_categories)

        val backArrow = findViewById<ImageView>(R.id.back_Arrow)

        backArrow.setOnClickListener {
            navigateBackToHomePage("Home")
        }

        val menuImage = findViewById<ImageView>(R.id.imageView26)
        menuImage.setOnClickListener {
            navigateToMenuPage()
        }

    }

    private fun navigateToMenuPage() {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }

    private fun navigateBackToHomePage(s: String) {
      val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }

}

