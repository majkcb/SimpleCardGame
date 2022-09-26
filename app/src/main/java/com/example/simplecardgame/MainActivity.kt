package com.example.simplecardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHowToPlay = findViewById<Button>(R.id.howtoplay)

        buttonHowToPlay.setOnClickListener {
            howToPlay()
        }

        val buttonPlay = findViewById<Button>(R.id.playButton)

        buttonPlay.setOnClickListener {
            play()
        }

    }

    fun howToPlay() {
        val intent = Intent(this, HowToPlayActivity::class.java)

        startActivity(intent)

    }

    fun play() {

        val intent = Intent(this, PlayActivity::class.java)
        startActivity(intent)


    }
}