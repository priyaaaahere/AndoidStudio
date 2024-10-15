package com.example.login

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GridLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout)
        var a=findViewById<ImageButton>(R.id.imageButton)
        var b=findViewById<ImageButton>(R.id.imageButton3)
        a.setOnClickListener {
            Toast.makeText(this,"Image view button clicked ",Toast.LENGTH_LONG).show()
        }
    }
}