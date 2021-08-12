package org.apiconapps.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val mOnePlayer = findViewById<TextView>(R.id.one_player)
        val mTwoPlayers = findViewById<TextView>(R.id.two_players)

        mOnePlayer.setOnClickListener {
            startActivity(Intent(this, OnePlayer::class.java))
            finish()
        }

        mTwoPlayers.setOnClickListener {
            startActivity(Intent(this, TwoPlayers::class.java))
            finish()
        }
    }
}