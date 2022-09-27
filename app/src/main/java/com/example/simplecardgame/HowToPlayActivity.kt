package com.example.simplecardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HowToPlayActivity : AppCompatActivity() {

    lateinit var howToPlayView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)

        howToPlayView = findViewById(R.id.howToPlayView)

        howToPlayView.text = "..."



    }
}