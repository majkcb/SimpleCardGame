package com.example.simplecardgame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HowToPlayActivity : AppCompatActivity() {

    lateinit var howToPlayView : TextView
    lateinit var backButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)

        howToPlayView = findViewById(R.id.howToPlayView)

        howToPlayView.text = "Beat the game by guessing if the next card is going to be over or under the card on display. If guessed correctly, you'll gain a point. If guessed incorrectly, you'll lose a point. Collect five points in total to beat the game. Keep in mind that the 'ace' is of the lowest value."

        val backButton = findViewById<Button>(R.id.backButton)


        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}