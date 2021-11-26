package com.example.android_lab2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
    }

    fun switchColor(view: View) {
        val btn = findViewById<Button>(R.id.button)
        btn.setBackgroundColor(Color.GREEN)
    }
}