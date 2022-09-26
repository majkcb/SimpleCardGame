package com.example.simplecardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

open class PlayActivity : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var pointsView : TextView
    val deck = mutableListOf<Card>()

    val clubsace = Card(R.drawable.clubsace, 1)
    val clubstwo = Card(R.drawable.clubstwo, 2)
    val clubsthree = Card(R.drawable.clubsthree, 3)
    val clubsfour = Card(R.drawable.clubsfour, 4)
    val clubsfive = Card(R.drawable.clubsfive, 5)
    val clubssix = Card(R.drawable.clubssix, 6)
    val clubsseven = Card(R.drawable.clubsseven, 7)
    val clubseight = Card(R.drawable.clubseight, 8)
    val clubsnine = Card(R.drawable.clubsnine, 9)
    val clubsten = Card(R.drawable.clubsten, 10)
    val clubsj = Card(R.drawable.clubsj, 11)
    val clubsq = Card(R.drawable.clubsq, 12)
    val clubsk = Card(R.drawable.clubsk, 13)

    val diamondsace = Card(R.drawable.diamondace, 1)
    val diamondstwo = Card(R.drawable.diamondstwo, 2)
    val diamondsthree = Card(R.drawable.diamondsthree, 3)
    val diamondsfour = Card(R.drawable.diamondsfour, 4)
    val diamondsfive = Card(R.drawable.diamondsfive, 5)
    val diamondssix = Card(R.drawable.diamondsix, 6)
    val diamondsseven = Card(R.drawable.diamondseven, 7)
    val diamondseight = Card(R.drawable.diamondeight, 8)
    val diamondsnine = Card(R.drawable.diamondnine, 9)
    val diamondsten = Card(R.drawable.diamondten, 10)
    val diamondsj = Card(R.drawable.diamondj, 11)
    val diamondsq = Card(R.drawable.diamondq, 12)
    val diamondsk = Card(R.drawable.diamondk, 13)

    val spadesace = Card(R.drawable.spadesace, 1)
    val spadestwo = Card(R.drawable.spadestwo, 2)
    val spadesthree = Card(R.drawable.spadesthree, 3)
    val spadesfour = Card(R.drawable.spadesfour, 4)
    val spadesfive = Card(R.drawable.spadesfive, 5)
    val spadessix = Card(R.drawable.spadessix, 6)
    val spadesseven = Card(R.drawable.spadesseven, 7)
    val spadeseight = Card(R.drawable.spadeseight, 8)
    val spadesnine = Card(R.drawable.spadesnine, 9)
    val spadesten = Card(R.drawable.spadesten, 10)
    val spadesj = Card(R.drawable.spadesj, 11)
    val spadesq = Card(R.drawable.spadesq, 12)
    val spadesk = Card(R.drawable.spadesk, 13)

    val heartsace = Card(R.drawable.heartsace, 1)
    val heartstwo = Card(R.drawable.heartstwo, 2)
    val heartsthree = Card(R.drawable.heartsthree, 3)
    val heartsfour = Card(R.drawable.heartsfour, 4)
    val heartsfive = Card(R.drawable.heartsfive, 5)
    val heartsix = Card(R.drawable.heartssix, 6)
    val heartsseven = Card(R.drawable.heartsseven, 7)
    val heartseight = Card(R.drawable.heartseight, 8)
    val heartsnine = Card(R.drawable.heartsnine, 9)
    val heartsten = Card(R.drawable.heartsthen, 10)
    val heartsj = Card(R.drawable.heartsj, 11)
    val heartsq = Card(R.drawable.heartsq, 12)
    val heartsk = Card(R.drawable.heartsk, 13)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        deck.add(clubsace)
        deck.add(clubstwo)
        deck.add(clubsthree)
        deck.add(clubsfour)
        deck.add(clubsfive)
        deck.add(clubssix)
        deck.add(clubsseven)
        deck.add(clubseight)
        deck.add(clubsnine)
        deck.add(clubsten)
        deck.add(clubsj)
        deck.add(clubsq)
        deck.add(clubsk)

        deck.add(diamondsace)
        deck.add(diamondstwo)
        deck.add(diamondsthree)
        deck.add(diamondsfour)
        deck.add(diamondsfive)
        deck.add(diamondssix)
        deck.add(diamondsseven)
        deck.add(diamondseight)
        deck.add(diamondsnine)
        deck.add(diamondsten)
        deck.add(diamondsj)
        deck.add(diamondsq)
        deck.add(diamondsk)

        deck.add(spadesace)
        deck.add(spadestwo)
        deck.add(spadesthree)
        deck.add(spadesfour)
        deck.add(spadesfive)
        deck.add(spadessix)
        deck.add(spadesseven)
        deck.add(spadeseight)
        deck.add(spadesnine)
        deck.add(spadesten)
        deck.add(spadesj)
        deck.add(spadesq)
        deck.add(spadesk)

        deck.add(heartsace)
        deck.add(heartstwo)
        deck.add(heartsthree)
        deck.add(heartsfour)
        deck.add(heartsfive)
        deck.add(heartsix)
        deck.add(heartsseven)
        deck.add(heartseight)
        deck.add(heartsnine)
        deck.add(heartsten)
        deck.add(heartsj)
        deck.add(heartsq)
        deck.add(heartsk)

        pointsView = findViewById(R.id.pointsView)
        imageView = findViewById(R.id.imageView2)

        val currentCard = deck.random()
        imageView.setImageResource(currentCard.image)

        var overButton = findViewById<Button>(R.id.button)
        var underButton = findViewById<Button>(R.id.buttonUnder)

        overButton.setOnClickListener {

            val newCard = deck.random()
            imageView.setImageResource(newCard.image)
            if (newCard.value > currentCard.value) {
                pointsView.text = "Correct"
            } else {
                pointsView.text = "Incorrect"
            }

        }
        underButton.setOnClickListener {

        }

    }

}

class Card(var image : Int, var value : Int) {

}
