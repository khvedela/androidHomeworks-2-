package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var intentOfSecond: Intent
    lateinit var add: Button
    lateinit var divide: Button
    lateinit var multiply: Button
    lateinit var subtract: Button
    lateinit var textView1: TextView
    lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        intentOfSecond = Intent(this, SecondActivity::class.java)
        add = findViewById(R.id.add)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        subtract = findViewById(R.id.subtract)
        textView1 = findViewById(R.id.editText1)
        textView2 = findViewById(R.id.editText2)

        var myList = listOf<View>(add, divide, multiply, subtract)

        myList.forEach {
            var action = it as Button

            it.setOnClickListener {
                intentOfSecond.putExtra("action", action.text.toString())
                intentOfSecond.putExtra("textView1", textView1.text.toString().toInt())
                intentOfSecond.putExtra("textView2", textView2.text.toString().toInt())
                startActivity(intentOfSecond)
            }
        }
    }

}