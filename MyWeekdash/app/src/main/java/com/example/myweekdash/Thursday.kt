package com.example.myweekdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Thursday : AppCompatActivity() {
    private lateinit var input : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thursday)

        input = findViewById(R.id.items)
        load()
        val output = findViewById<TextView>(R.id.tv)
        var show = input.text.toString()
        output.text = show

        // Back button
        val btnBack = findViewById<Button>(R.id.backBtn)
        btnBack.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }


        // set button
        val btnSet = findViewById<Button>(R.id.setBtn)
        btnSet.setOnClickListener {
            show = input.text.toString()
            output.text = show
        }

        // Reset button
        val btnReset = findViewById<Button>(R.id.resetBtn)
        btnReset.setOnClickListener{
            show = "empty"
            output.text = show
        }
    }
    override fun onStop(){
        super.onStop()
        save()
    }
    private fun save(){
        val thursdayText = input.text.toString()
        val sp = getSharedPreferences("Data", MODE_PRIVATE)
        val editor = sp.edit()
        editor.putString("Thursday", thursdayText)
        editor.apply()
    }

    private fun load(){
        val thursdayText: String
        val sp = getSharedPreferences("Data", MODE_PRIVATE)
        thursdayText = sp.getString("Thursday", String()).toString()
        input.setText(thursdayText)
    }
}