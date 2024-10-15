package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a = findViewById<EditText>(R.id.editTextText)
        var b = findViewById<EditText>(R.id.editTextText2)
        var buttn = findViewById<Button>(R.id.button)
        var txtview = findViewById<TextView>(R.id.textView)
        buttn.setOnClickListener {
            var x = a.text.toString()
            var y = b.text.toString()
            txtview.text = "Your name is " + x + " and your phone number is " + y
        }
    }
}