package com.rohit.firstapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Connect layout to this activity
        setContentView(R.layout.activity_second)
    }
}
