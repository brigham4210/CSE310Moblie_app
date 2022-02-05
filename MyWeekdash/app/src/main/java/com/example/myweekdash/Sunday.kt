package com.example.myweekdash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Sunday : AppCompatActivity() {

    private lateinit var input : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunday)

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
        val sundayText = input.text.toString()
        val sp = getSharedPreferences("Data", MODE_PRIVATE)
        val editor = sp.edit()
        editor.putString("Sunday", sundayText)
        editor.apply()

    }

    private fun load(){
        val sundayText: String
        val sp = getSharedPreferences("Data", MODE_PRIVATE)
        sundayText = sp.getString("Sunday", String()).toString()
        input.setText(sundayText)


    }

}