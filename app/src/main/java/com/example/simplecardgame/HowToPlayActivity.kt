package com.example.simplecardgame


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HowToPlayActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var backButton : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)

        imageView = findViewById(R.id.htpView)

        imageView.setImageResource(R.drawable.htp2)

        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}