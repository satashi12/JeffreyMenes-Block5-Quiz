package com.jeffrey.menes.block5.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addingtwonumbers()
    }

    fun addingtwonumbers()
    {
        var num1 = findViewById<EditText>(R.id.number1)
        var num2 = findViewById<EditText>(R.id.number2)
        var button1 =  findViewById<Button>(R.id.add_button)
        var clearbutton =  findViewById<Button>(R.id.clearbutton)

        button1.setOnClickListener{

            Toast.makeText(this,"Hello, this button is working",Toast.LENGTH_SHORT).show()
        }





    }

}