package com.rohit.firstapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Connect XML layout
        setContentView(R.layout.activity_main)


        // Connect button from XML
        val btnNext = findViewById<Button>(R.id.btnNext)


        // Button click listener
        btnNext.setOnClickListener {


            // Intent = Navigation object
            val intent = Intent(this, SecondActivity::class.java)


            // Open second page
            startActivity(intent)
        }
    }
}
