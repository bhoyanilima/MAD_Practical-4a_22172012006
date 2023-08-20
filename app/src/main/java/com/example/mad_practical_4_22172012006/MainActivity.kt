package com.example.mad_practical_4_22172012006

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1:Button = findViewById(R.id.button)
        val button2:Button = findViewById(R.id.button2)
        button1.setOnClickListener{
            val intent1 = Intent(this, LoginActivity::class.java)
            startActivity(intent1)

        }
        button2.setOnClickListener{
            val intent = Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}