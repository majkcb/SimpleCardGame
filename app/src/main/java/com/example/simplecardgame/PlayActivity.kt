package com.example.simplecardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PlayActivity : AppCompatActivity() {

    lateinit var imageView : ImageView
    lateinit var button : Button


    val cardImages : IntArray = intArrayOf(
        R.drawable.clubsace,
        R.drawable.clubstwo,
        R.drawable.clubsthree,
        R.drawable.clubsfour,
        R.drawable.clubsfive,
        R.drawable.clubssix,
        R.drawable.clubsseven,
        R.drawable.clubseight,
        R.drawable.clubsnine,
        R.drawable.clubsten,
        R.drawable.clubsj,
        R.drawable.clubsq,
        R.drawable.clubsk,
        R.drawable.diamondace,
        R.drawable.diamondstwo,
        R.drawable.diamondsthree,
        R.drawable.diamondsfour,
        R.drawable.diamondsfive,
        R.drawable.diamondsix,
        R.drawable.diamondseven,
        R.drawable.diamondeight,
        R.drawable.diamondnine,
        R.drawable.diamondten,
        R.drawable.diamondj,
        R.drawable.diamondk,
        R.drawable.heartsace,
        R.drawable.heartstwo,
        R.drawable.heartsthree,
        R.drawable.heartsfour,
        R.drawable.heartsfive,
        R.drawable.heartssix,
        R.drawable.heartsseven,
        R.drawable.heartseight,
        R.drawable.heartsnine,
        R.drawable.heartsthen,
        R.drawable.heartsj,
        R.drawable.heartsk,
        R.drawable.spadesace,
        R.drawable.spadestwo,
        R.drawable.spadesthree,
        R.drawable.spadesfour,
        R.drawable.spadesfive,
        R.drawable.spadessix,
        R.drawable.spadesseven,
        R.drawable.spadeseight,
        R.drawable.spadesnine,
        R.drawable.spadesten,
        R.drawable.spadesj,
        R.drawable.spadesq,
        R.drawable.spadesk

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        imageView = findViewById(R.id.imageView2)

        val random = kotlin.random.Random
        imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])

        var overButton = findViewById<Button>(R.id.button)
        var underButton = findViewById<Button>(R.id.buttonUnder)

        overButton.setOnClickListener {
            pressOver()
        }
        underButton.setOnClickListener {
            pressUnder()
        }


    }

    fun pressOver() {
        imageView = findViewById(R.id.imageView2)
        val random = kotlin.random.Random
        imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])
    }

    fun pressUnder() {
        imageView = findViewById(R.id.imageView2)
        val random = kotlin.random.Random
        imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])

    }
}