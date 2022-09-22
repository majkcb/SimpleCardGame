package com.example.simplecardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

open class PlayActivity : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var pointsView: TextView
    val deck = mutableListOf<Card>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        imageView = findViewById(R.id.imageView2)

        var overButton = findViewById<Button>(R.id.button)
        var underButton = findViewById<Button>(R.id.buttonUnder)

        overButton.setOnClickListener {
            pressOver()
        }
        underButton.setOnClickListener {
            pressUnder()
        }

        val clubsace = Card(R.drawable.clubsace, 1, "clubs")
        val clubstwo = Card(R.drawable.clubstwo, 2, "clubs")
        val clubsthree = Card(R.drawable.clubsthree, 3, "clubs")
        val clubsfour = Card(R.drawable.clubsfour, 4, "clubs")
        val clubsfive = Card(R.drawable.clubsfive, 5, "clubs")
        val clubssix = Card(R.drawable.clubssix, 6, "clubs")
        val clubsseven = Card(R.drawable.clubsseven, 7, "clubs")
        val clubseight = Card(R.drawable.clubseight, 8, "clubs")
        val clubsnine = Card(R.drawable.clubsnine, 9, "clubs")
        val clubsten = Card(R.drawable.clubsten, 10, "clubs")
        val clubsj = Card(R.drawable.clubsj, 11, "clubs")
        val clubsq = Card(R.drawable.clubsq, 12, "clubs")
        val clubsk = Card(R.drawable.clubsk, 13, "clubs")

        val diamondsace = Card(R.drawable.diamondace, 1, "diamond")
        val diamondstwo = Card(R.drawable.diamondstwo, 2, "diamond")
        val diamondsthree = Card(R.drawable.diamondsthree, 3, "diamond")
        val diamondsfour = Card(R.drawable.diamondsfour, 4, "diamond")
        val diamondsfive = Card(R.drawable.diamondsfive, 5, "diamond")
        val diamondssix = Card(R.drawable.diamondsix, 6, "diamond")
        val diamondsseven = Card(R.drawable.diamondseven, 7, "diamond")
        val diamondseight = Card(R.drawable.diamondeight, 8, "diamond")
        val diamondsnine = Card(R.drawable.diamondnine, 9, "diamond")
        val diamondsten = Card(R.drawable.diamondten, 10, "diamond")
        val diamondsj = Card(R.drawable.diamondj, 11, "diamond")
        val diamondsq = Card(R.drawable.diamondq, 12, "diamond")
        val diamondsk = Card(R.drawable.diamondk, 13, "diamond")

        val spadesace = Card(R.drawable.spadesace, 1, "spades")
        val spadestwo = Card(R.drawable.spadestwo, 2, "spades")
        val spadesthree = Card(R.drawable.spadesthree, 3, "spades")
        val spadesfour = Card(R.drawable.spadesfour, 4, "spades")
        val spadesfive = Card(R.drawable.spadesfive, 5, "spades")
        val spadessix = Card(R.drawable.spadessix, 6, "spades")
        val spadesseven = Card(R.drawable.spadesseven, 7, "spades")
        val spadeseight = Card(R.drawable.spadeseight, 8, "spades")
        val spadesnine = Card(R.drawable.spadesnine, 9, "spades")
        val spadesten = Card(R.drawable.spadesten, 10, "spades")
        val spadesj = Card(R.drawable.spadesj, 11, "spades")
        val spadesq = Card(R.drawable.spadesq, 12, "spades")
        val spadesk = Card(R.drawable.spadesk, 13, "spades")

        val heartsace = Card(R.drawable.heartsace, 1, "hearts")
        val heartstwo = Card(R.drawable.heartstwo, 2, "hearts")
        val heartsthree = Card(R.drawable.heartsthree, 3, "hearts")
        val heartsfour = Card(R.drawable.heartsfour, 4, "hearts")
        val heartsfive = Card(R.drawable.heartsfive, 5, "hearts")
        val heartsix = Card(R.drawable.heartssix, 6, "hearts")
        val heartsseven = Card(R.drawable.heartsseven, 7, "hearts")
        val heartseight = Card(R.drawable.heartseight, 8, "hearts")
        val heartsnine = Card(R.drawable.heartsnine, 9, "hearts")
        val heartsten = Card(R.drawable.heartsthen, 10, "hearts")
        val heartsj = Card(R.drawable.heartsj, 11, "hearts")
        val heartsq = Card(R.drawable.heartsq, 12, "hearts")
        val heartsk = Card(R.drawable.heartsk, 13, "hearts")

        deck.add(clubsace)
        deck.add(clubstwo)
        deck.add(clubsthree)
        deck.add(clubsfour)
        deck.add(clubsfive)
        deck.add(clubssix)
        deck.add(clubsseven)
        deck.add(clubseight)
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


    }

    fun pressOver() {
        imageView = findViewById(R.id.imageView2)


    }

    fun pressUnder() { // points ihopkopplat med random ort,
        pointsView = findViewById(R.id.pointsView)


    }


}

class Card(var image : Int, var value : Int, var suite : String) {


}