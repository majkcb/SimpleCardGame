package com.example.simplecardgame

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

open class PlayActivity : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var pointsView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val deckOfCards = Deck()

        pointsView = findViewById(R.id.pointsView)
        imageView = findViewById(R.id.imageView2)

        animationBounce()

        var points = mainPoints()

        val overButton = findViewById<Button>(R.id.button)
        val underButton = findViewById<Button>(R.id.buttonUnder)

        var currentCard = currentCard(deckOfCards)

        overButton.setOnClickListener {

            animationFadeIn()

            val newCard = deckOfCards.getCard()
            imageView.setImageResource(newCard.image)
            points = pointsValueOverButton(currentCard, newCard, points)

            currentCard = newCard

            winPoints(points)

        }
        
        underButton.setOnClickListener {

            animationFadeIn()

            val newCard = deckOfCards.getCard()
            imageView.setImageResource(newCard.image)
            points = pointsValueUnderButton(currentCard, newCard, points)

            currentCard = newCard

            winPoints(points)

        }

    }

    private fun currentCard(deckOfCards: Deck): Card {
        val currentCard = deckOfCards.getCard()
        imageView.setImageResource(currentCard.image)
        return currentCard
    }

    private fun animationFadeIn() {
        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein)
        imageView.startAnimation(fadeIn)
    }

    private fun mainPoints(): Int {
        val points = 0
        pointsView.text = "Points: $points"
        return points

    }

    private fun pointsValueUnderButton(
        currentCard: Card,
        newCard: Card,
        points: Int
    ): Int {
        var points1 = points

        if (currentCard.value > newCard.value) {
            points1++
            pointsView.text = "Points: $points1"
            pointsView.setTextColor(Color.YELLOW)
        } else {
            points1--
            pointsView.setTextColor(Color.RED)
            if (points1 < 0) {
                points1 = 0
            }
            pointsView.text = "Points: $points1"

            if (currentCard.value == newCard.value) {
                points1
                pointsView.text = "Points: $points1"
                pointsView.setTextColor(Color.BLACK)
            }

        }
        return points1
    }

    private fun winPoints(points: Int) {
        if (points == 5) {
            val intent = Intent(this, WinActivity::class.java)

            startActivity(intent)
        }
    }

    private fun pointsValueOverButton(
        currentCard: Card,
        newCard: Card,
        points: Int
    ): Int {
        var points1 = points
        if (currentCard.value < newCard.value) {
            points1++
            pointsView.text = "Points: $points1"
            pointsView.setTextColor(Color.YELLOW)
        } else {
            points1--
            pointsView.setTextColor(Color.RED)
            if (points1 < 0) {
                points1 = 0
            }
            pointsView.text = "Points: $points1"

            if (currentCard.value == newCard.value) {
                points1
                pointsView.text = "Points: $points1"
                pointsView.setTextColor(Color.BLACK)
            }
        }
        return points1
    }

    private fun animationBounce() {
        val bounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
        imageView.startAnimation(bounce)
    }

}


