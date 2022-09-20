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

        howToPlayView.text = "Once you click the play button, a random card is drawn from the deck. You're now going to guess if the card that's drawn next is a bigger or smaller number by using the Under or Over buttons."



    }
}