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

        val bounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
        imageView.startAnimation(bounce)

        var points = 0
        pointsView.text = points.toString()
        pointsView.setText("Points: $points")

        var overButton = findViewById<Button>(R.id.button)
        var underButton = findViewById<Button>(R.id.buttonUnder)


        var currentCard = deckOfCards.getCard()
        imageView.setImageResource(currentCard.image)

        overButton.setOnClickListener {

            val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein)
            imageView.startAnimation(fadeIn)

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


            }
              currentCard = newCard

            if (points == 5) {
                val intent = Intent(this, WinActivity::class.java)

                startActivity(intent)
            }

        }
        
        underButton.setOnClickListener {

            val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein)
            imageView.startAnimation(fadeIn)

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

/* ett problem jag satt med länge var att poängen
inte skulle kunna gå under 0. tyckte att if-satsen
inte annat än kunde stämma men det funkade ändå inte.
tillslut började jag logga vart det kunde gått fel
och kom fram till att jag satt if-satsen för långt ner.
den hann alltså gå minus innan.
 */
