package com.example.simplecardgame


import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WinActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var menuButton : Button
    lateinit var playAgainButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        winView()

        winAnimation()


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

    private fun winAnimation() {
        val blinkAnim = AnimationUtils.loadAnimation(this, R.anim.blink_anim)
        imageView.startAnimation(blinkAnim)
    }

    private fun winView() {
        imageView = findViewById(R.id.winView)
        imageView.setImageResource(R.drawable.winlogo)
    }
}