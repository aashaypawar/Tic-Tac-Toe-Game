package org.apiconapps.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class TwoPlayers : AppCompatActivity() {
    private lateinit var iv1: ImageView
    private lateinit var iv2: ImageView
    private lateinit var iv3: ImageView
    private lateinit var iv4: ImageView
    private lateinit var iv5: ImageView
    private lateinit var iv6: ImageView
    private lateinit var iv7: ImageView
    private lateinit var iv8: ImageView
    private lateinit var iv9: ImageView
    private lateinit var ivR: ImageView
    private lateinit var mGrid: LinearLayout
    private lateinit var mButton: Button
    private lateinit var mBack: TextView
    private lateinit var mStatus: TextView
    private val referenceList = arrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_two_players)

        iv1 = findViewById(R.id.iv1)
        iv2 = findViewById(R.id.iv2)
        iv3 = findViewById(R.id.iv3)
        iv4 = findViewById(R.id.iv4)
        iv5 = findViewById(R.id.iv5)
        iv6 = findViewById(R.id.iv6)
        iv7 = findViewById(R.id.iv7)
        iv8 = findViewById(R.id.iv8)
        iv9 = findViewById(R.id.iv9)
        ivR = findViewById(R.id.result)
        mGrid = findViewById(R.id.grid)
        mButton = findViewById(R.id.start)
        mBack = findViewById(R.id.back)
        mStatus = findViewById(R.id.status)

        mBack.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        mButton.setOnClickListener {
            finish()
            startActivity(Intent(this@TwoPlayers, TwoPlayers::class.java))
        }

        var count = 0

        iv1.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv1.setImageResource(R.drawable.ic_circle)
                referenceList[0] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv1.setImageResource(R.drawable.ic_cross)
                referenceList[0] = 1
                checker()
            }
            count++
        }

        iv2.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv2.setImageResource(R.drawable.ic_circle)
                referenceList[1] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv2.setImageResource(R.drawable.ic_cross)
                referenceList[1] = 1
                checker()
            }
            count++
        }

        iv3.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv3.setImageResource(R.drawable.ic_circle)
                referenceList[2] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv3.setImageResource(R.drawable.ic_cross)
                referenceList[2] = 1
                checker()
            }
            count++
        }

        iv4.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv4.setImageResource(R.drawable.ic_circle)
                referenceList[3] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv4.setImageResource(R.drawable.ic_cross)
                referenceList[3] = 1
                checker()
            }
            count++
        }

        iv5.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv5.setImageResource(R.drawable.ic_circle)
                referenceList[4] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv5.setImageResource(R.drawable.ic_cross)
                referenceList[4] = 1
                checker()
            }
            count++
        }

        iv6.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv6.setImageResource(R.drawable.ic_circle)
                referenceList[5] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv6.setImageResource(R.drawable.ic_cross)
                referenceList[5] = 1
                checker()
            }
            count++
        }

        iv7.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv7.setImageResource(R.drawable.ic_circle)
                referenceList[6] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv7.setImageResource(R.drawable.ic_cross)
                referenceList[6] = 1
                checker()
            }
            count++
        }

        iv8.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv8.setImageResource(R.drawable.ic_circle)
                referenceList[7] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv8.setImageResource(R.drawable.ic_cross)
                referenceList[7] = 1
                checker()
            }
            count++
        }

        iv9.setOnClickListener {
            if(count%2 == 0){
                mStatus.text = "Player 2's Turn"
                iv9.setImageResource(R.drawable.ic_circle)
                referenceList[8] = 0
                checker()

            } else {
                mStatus.text = "Player 1's Turn"
                iv9.setImageResource(R.drawable.ic_cross)
                referenceList[8] = 1
                checker()
            }
            count++
        }
    }

    private fun checker(){

        if(referenceList[0] == 0 && referenceList[1] == 0 && referenceList[2] == 0){
            ivR.setImageResource(R.drawable.ic_012)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[0] == 1 && referenceList[1] == 1 && referenceList[2] == 1){
            ivR.setImageResource(R.drawable.ic_012)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[3] == 0 && referenceList[4] == 0 && referenceList[5] == 0){
            ivR.setImageResource(R.drawable.ic_345)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[3] == 1 && referenceList[4] == 1 && referenceList[5] == 1){
            ivR.setImageResource(R.drawable.ic_345)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[6] == 0 && referenceList[7] == 0 && referenceList[8] == 0){
            ivR.setImageResource(R.drawable.ic_678)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[6] == 1 && referenceList[7] == 1 && referenceList[8] == 1){
            ivR.setImageResource(R.drawable.ic_678)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[0] == 0 && referenceList[3] == 0 && referenceList[6] == 0){
            ivR.setImageResource(R.drawable.ic_036)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[0] == 1 && referenceList[3] == 1 && referenceList[6] == 1){
            ivR.setImageResource(R.drawable.ic_036)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[1] == 0 && referenceList[4] == 0 && referenceList[7] == 0){
            ivR.setImageResource(R.drawable.ic_147)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[1] == 1 && referenceList[4] == 1 && referenceList[7] == 1){
            ivR.setImageResource(R.drawable.ic_147)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[2] == 0 && referenceList[5] == 0 && referenceList[8] == 0){
            ivR.setImageResource(R.drawable.ic_258)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[2] == 1 && referenceList[5] == 1 && referenceList[8] == 1){
            ivR.setImageResource(R.drawable.ic_258)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[0] == 0 && referenceList[4] == 0 && referenceList[8] == 0){
            ivR.setImageResource(R.drawable.ic_048)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[0] == 1 && referenceList[4] == 1 && referenceList[8] == 1){
            ivR.setImageResource(R.drawable.ic_048)
            gameResultDialog("Player 2 Wins!")
        }

        if(referenceList[2] == 0 && referenceList[4] == 0 && referenceList[6] == 0){
            ivR.setImageResource(R.drawable.ic_246)
            gameResultDialog("Player 1 Wins!")
        }
        if(referenceList[2] == 1 && referenceList[4] == 1 && referenceList[6] == 1){
            ivR.setImageResource(R.drawable.ic_246)
            gameResultDialog("Player 2 Wins!")
        }
    }

    private fun gameResultDialog(result: String){
        val mDialogBuilder = AlertDialog.Builder(this)
        mDialogBuilder.apply {
            setTitle(result)
            setPositiveButton("Start New Game") { _, _ ->
                finish()
                startActivity(Intent(this@TwoPlayers, TwoPlayers::class.java))
            }
            setNegativeButton("Close") { _, _ ->
                iv1.isClickable = false
                iv2.isClickable = false
                iv3.isClickable = false
                iv4.isClickable = false
                iv5.isClickable = false
                iv6.isClickable = false
                iv7.isClickable = false
                iv8.isClickable = false
                iv9.isClickable = false
            }
        }

        // Create and show the dialog
        val mDialog = mDialogBuilder.create()
        mDialog.show()
    }

    override fun onBackPressed() {
        this.moveTaskToBack(true)
    }
}