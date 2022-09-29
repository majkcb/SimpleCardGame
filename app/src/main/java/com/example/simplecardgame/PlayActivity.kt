package com.example.simplecardgame

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

open class PlayActivity : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var pointsView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        var deckOfCards = Deck()

        pointsView = findViewById(R.id.pointsView)
        imageView = findViewById(R.id.imageView2)

        var points = 0
        pointsView.text = points.toString()
        pointsView.setText("Points: $points")

        var overButton = findViewById<Button>(R.id.button)
        var underButton = findViewById<Button>(R.id.buttonUnder)

        var currentCard = deckOfCards.getCard()
        imageView.setImageResource(currentCard.image)

        overButton.setOnClickListener {
            
            var newCard = deckOfCards.getCard()
            imageView.setImageResource(newCard.image)
            if (currentCard.value < newCard.value) {
                points ++
                pointsView.setText("Points: ${points}")
                pointsView.setTextColor(Color.GREEN)
            } else {
                points --
                if (points < 0) {
                    points = 0
                    Log.d("!!!", "${points}")

                }

                pointsView.setText("Points: ${points}")
                pointsView.setTextColor(Color.RED)
            }

            if (points < 0) {
                points = 0
                Log.d("!!!", "${points}")

            }
              currentCard = newCard

            if (points == 5) {
                val intent = Intent(this, WinActivity::class.java)

                startActivity(intent)
            }

        }
        
        underButton.setOnClickListener {

            var newCard = deckOfCards.getCard()
            imageView.setImageResource(newCard.image)
            if (currentCard.value > newCard.value) {
                points ++
                pointsView.setText("Points: ${points}")
                pointsView.setTextColor(Color.GREEN)
            } else {
                points --
                if (points < 0) {
                    points = 0
                    Log.d("!!!", "${points}")

                }
                pointsView.setText("Points: ${points}")
                pointsView.setTextColor(Color.RED)
            }

            if (points < 0) {
                points = 0

            }
            currentCard = newCard

            if (points == 5) {
                val intent = Intent(this, WinActivity::class.java)

                startActivity(intent)
            }

        }

    }

}