package com.example.myapplication


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.content.Intent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.res.ResourcesCompat




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView6)


        imageView.setOnClickListener {
            // Create an Intent to start Screen02
            val intent = Intent(this, Screen03::class.java)
            startActivity(intent)







        }
    }
}