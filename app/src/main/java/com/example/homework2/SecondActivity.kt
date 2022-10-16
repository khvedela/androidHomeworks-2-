package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        val action:String = intent!!.getStringExtra("action").toString();
        val input1:Int = intent!!.getIntExtra("textView1", -1);
        val input2:Int = intent!!.getIntExtra("textView2", -1);

        textView.text = calculate(action, input1, input2)

    }

    fun calculate(action: String, input1: Int, input2: Int) : String {
        return when (action) {
            "+" -> (input1 + input2).toString()
            "-" -> (input1 - input2).toString()
            "*" -> (input1 * input2).toString()
            "/" -> (input1 / input2).toString()
            else -> "-1"
        }
    }
}