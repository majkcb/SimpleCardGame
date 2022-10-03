package com.example.simplecardgame


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class WinActivity : AppCompatActivity() {


    lateinit var menuButton : Button
    lateinit var playAgainButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)


       // val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val blinkAnim = AnimationUtils.loadAnimation(this, R.anim.blink_anim)
      //  winView.startAnimation(rotate)



        var menuButton = findViewById<Button>(R.id.menuButton)
        var playAgainButton = findViewById<Button>(R.id.playAgainButton)


        menuButton.setOnClickListener {
             val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        playAgainButton.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity((intent))
        }


    }
}