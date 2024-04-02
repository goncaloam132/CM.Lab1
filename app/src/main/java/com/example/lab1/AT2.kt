package com.example.lab1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AT2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.at2)

        val buttonCloseAT2: Button = findViewById(R.id.close_at2)
        buttonCloseAT2.setOnClickListener {
            finish()
        }
    }
}