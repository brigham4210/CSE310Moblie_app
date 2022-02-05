package com.example.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.clickBtn)
        val zeroBtnClick = findViewById<Button>(R.id.zeroBtn)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClick.setOnClickListener {
            timesClicked += 1
            tvMyTextView.text = "$timesClicked"
        }
        zeroBtnClick.setOnClickListener {
            timesClicked = 0
            tvMyTextView.text = "$timesClicked"
        }
    }
}