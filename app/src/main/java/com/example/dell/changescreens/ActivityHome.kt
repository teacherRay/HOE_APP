package com.example.dell.changescreens

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNextScreen : Button = findViewById(R.id.buttonhome)
        btnNextScreen.setOnClickListener{
            val intent = Intent(this,MainActivity :: class.java)
            startActivity(intent)
        }

    }
}
