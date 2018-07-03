package com.example.dell.changescreens

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNextScreen : Button = findViewById(R.id.buttonNews)
            btnNextScreen.setOnClickListener{
                val intent = Intent(this,MainActivity2 :: class.java)
                startActivity(intent)
            }
            val btnActivityFeesScreen : Button = findViewById(R.id.buttonFees)
            btnActivityFeesScreen.setOnClickListener{
                val intent = Intent(this,ActivityFees :: class.java)
                startActivity(intent)
            }

            val btnActivityMapScreen : Button = findViewById(R.id.buttonLocation)
            btnActivityMapScreen.setOnClickListener{
                val intent = Intent(this,MapsActivity :: class.java)
                startActivity(intent)
            }


    }
}
