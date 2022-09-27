package com.example.simplecardgame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

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
        pointsView.setText("Points: ")

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
                pointsView.setText("Points: ${points}")
                pointsView.setTextColor(Color.RED)
            }
              currentCard = newCard

            if (points == 2) {
                pointsView.text = "Congrats!"
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
                pointsView.setText("Points: ${points}")
                pointsView.setTextColor(Color.RED)
            }
            currentCard = newCard

            if (points == 2) {
                pointsView.text ="Congrats!"
                pointsView.setTextColor(Color.YELLOW)
            }

        }

    }

}