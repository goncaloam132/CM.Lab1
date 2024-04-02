package com.example.lab1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.at1)

        val buttonGoToAT2: Button = findViewById(R.id.button_go_to_at2)
        buttonGoToAT2.setOnClickListener {
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }
    }
}