package com.example.myweekdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSunday = findViewById<Button>(R.id.sundayBtn)
        btnSunday.setOnClickListener {
            val intent = Intent( this, Sunday::class.java)
            startActivity(intent)
        }

        val btnMonday = findViewById<Button>(R.id.mondayBtn)
        btnMonday.setOnClickListener {
            val intent = Intent( this, Monday::class.java)
            startActivity(intent)
        }

        val btnTuesday = findViewById<Button>(R.id.tuesdayBtn)
        btnTuesday.setOnClickListener {
            val intent = Intent( this, Tuesday::class.java)
            startActivity(intent)
        }

        val btnWednesday = findViewById<Button>(R.id.wednesdayBtn)
        btnWednesday.setOnClickListener {
            val intent = Intent( this, Wednesday::class.java)
            startActivity(intent)
        }

        val btnThursday = findViewById<Button>(R.id.thursdayBtn)
        btnThursday.setOnClickListener {
            val intent = Intent( this, Thursday::class.java)
            startActivity(intent)
        }

        val btnFriday = findViewById<Button>(R.id.fridayBtn)
        btnFriday.setOnClickListener {
            val intent = Intent( this, Friday::class.java)
            startActivity(intent)
        }

        val btnSaturday = findViewById<Button>(R.id.saturdayBtn)
        btnSaturday.setOnClickListener {
            val intent = Intent( this, Saturday::class.java)
            startActivity(intent)
        }
    }
}