package com.example.myweekdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Wednesday : AppCompatActivity() {
    private lateinit var input : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wednesday)

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
        val wednesdayText = input.text.toString()
        val sp = getSharedPreferences("Data", MODE_PRIVATE)
        val editor = sp.edit()
        editor.putString("Wednesday", wednesdayText)
        editor.apply()
    }

    private fun load(){
        val wednesdayText: String
        val sp = getSharedPreferences("Data", MODE_PRIVATE)
        wednesdayText = sp.getString("Wednesday", String()).toString()
        input.setText(wednesdayText)
    }
}