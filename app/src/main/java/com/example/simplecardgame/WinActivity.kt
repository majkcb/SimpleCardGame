package com.example.simplecardgame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WinActivity : AppCompatActivity() {

    lateinit var winView : TextView
    lateinit var menuButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        winView = findViewById(R.id.winningView)
        winView.text = "YOU WIN :)"

        var menuButton = findViewById<Button>(R.id.menuButton)

        menuButton.setOnClickListener {
             val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}