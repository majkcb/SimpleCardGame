package com.example.simplecardgame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageView = findViewById(R.id.logoView)

        imageView.setImageResource(R.drawable.logo)

        val buttonHowToPlay = findViewById<Button>(R.id.howtoplay)

        buttonHowToPlay.setOnClickListener {
            howToPlay()
        }

        val buttonPlay = findViewById<Button>(R.id.playButton)

        buttonPlay.setOnClickListener {
            play()
        }
    }

    private fun howToPlay() {
        val intent = Intent(this, HowToPlayActivity::class.java)

        startActivity(intent)

    }

    private fun play() {

        val intent = Intent(this, PlayActivity::class.java)
        startActivity(intent)

    }

}