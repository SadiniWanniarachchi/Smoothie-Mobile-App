package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val image01 = findViewById<ImageView>(R.id.imageView11)
        val image02 = findViewById<ImageView>(R.id.imageView16)
        val image03 = findViewById<ImageView>(R.id.imageView12)
        val image04 = findViewById<ImageView>(R.id.imageView14)
        val image05 = findViewById<ImageView>(R.id.imageView13)
        val image06 = findViewById<ImageView>(R.id.imageView15)


        val imageExit = findViewById<ImageView>(R.id.imageView20)

        val imageP = findViewById<ImageView>(R.id.imageView22)

        image01.setOnClickListener {
            navigateToCategoriesPage("Category")
        }

        image02.setOnClickListener {
            navigateToCategoriesPage("Category")
        }

        image03.setOnClickListener {
            navigateToCategoriesPage("Category")
        }

        image04.setOnClickListener {
            navigateToCategoriesPage("Category")
        }

        image05.setOnClickListener {
            navigateToCategoriesPage("Category")
        }

        image06.setOnClickListener {
            navigateToCategoriesPage("Category")
        }


        imageExit.setOnClickListener {
            navigateToExitPage("Exit")
        }

        imageP.setOnClickListener {
            navigateToProfilePage("Profile")
        }


    }

    private fun navigateToProfilePage(s: String) {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }

    private fun navigateToExitPage(s: String) {
        val intent = Intent(this, Exit::class.java)
        startActivity(intent)
    }

    private fun navigateToCategoriesPage(s: String) {
        val intent = Intent(this, Categories::class.java)
        startActivity(intent)
    }




}
