package org.apiconapps.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class OnePlayer : AppCompatActivity() {
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
    private val usedSpace = arrayOf(false, false, false, false, false, false, false, false, false)
    private val referenceList = arrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_one_player)

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

        mBack.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        mButton.setOnClickListener {
            finish()
            startActivity(Intent(this@OnePlayer, OnePlayer::class.java))
        }

        iv1.setOnClickListener {
            if(!usedSpace[0]){
                iv1.setImageResource(R.drawable.ic_circle)
                usedSpace[0] = true
                referenceList[0] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv2.setOnClickListener {
            if(!usedSpace[1]){
                iv2.setImageResource(R.drawable.ic_circle)
                usedSpace[1] = true
                referenceList[1] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv3.setOnClickListener {
            if(!usedSpace[2]){
                iv3.setImageResource(R.drawable.ic_circle)
                usedSpace[2] = true
                referenceList[2] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv4.setOnClickListener {
            if(!usedSpace[3]){
                iv4.setImageResource(R.drawable.ic_circle)
                usedSpace[3] = true
                referenceList[3] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv5.setOnClickListener {
            if(!usedSpace[4]){
                iv5.setImageResource(R.drawable.ic_circle)
                usedSpace[4] = true
                referenceList[4] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv6.setOnClickListener {
            if(!usedSpace[5]){
                iv6.setImageResource(R.drawable.ic_circle)
                usedSpace[5] = true
                referenceList[5] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv7.setOnClickListener {
            if(!usedSpace[6]){
                iv7.setImageResource(R.drawable.ic_circle)
                usedSpace[6] = true
                referenceList[6] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv8.setOnClickListener {
            if(!usedSpace[7]){
                iv8.setImageResource(R.drawable.ic_circle)
                usedSpace[7] = true
                referenceList[7] = 0
                checker()
                computerPlay()
                checker()
            }
        }

        iv9.setOnClickListener {
            if(!usedSpace[8]){
                iv9.setImageResource(R.drawable.ic_circle)
                usedSpace[8] = true
                referenceList[8] = 0
                checker()
                computerPlay()
                checker()
            }
        }
    }

    private fun computerPlay(){
        val list: MutableList<Int> = ArrayList()

        for(i in usedSpace.indices){
            if(!usedSpace[i]){
                list.add(i)
            }
        }

        if(list.size > 0){
            val randomVal = list.random() + 1
            when(randomVal){
                1 -> iv1.setImageResource(R.drawable.ic_cross)
                2 -> iv2.setImageResource(R.drawable.ic_cross)
                3 -> iv3.setImageResource(R.drawable.ic_cross)
                4 -> iv4.setImageResource(R.drawable.ic_cross)
                5 -> iv5.setImageResource(R.drawable.ic_cross)
                6 -> iv6.setImageResource(R.drawable.ic_cross)
                7 -> iv7.setImageResource(R.drawable.ic_cross)
                8 -> iv8.setImageResource(R.drawable.ic_cross)
                9 -> iv9.setImageResource(R.drawable.ic_cross)
            }
            usedSpace[randomVal-1] = true
            referenceList[randomVal-1] = 1
        } else {
            gameResultDialog("It's a Tie!")
        }
    }

    private fun checker(){

        if(referenceList[0] == 0 && referenceList[1] == 0 && referenceList[2] == 0){
            ivR.setImageResource(R.drawable.ic_012)
            gameResultDialog("You Win!")
        }
        if(referenceList[0] == 1 && referenceList[1] == 1 && referenceList[2] == 1){
            ivR.setImageResource(R.drawable.ic_012)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[3] == 0 && referenceList[4] == 0 && referenceList[5] == 0){
            ivR.setImageResource(R.drawable.ic_345)
            gameResultDialog("You Win!")
        }
        if(referenceList[3] == 1 && referenceList[4] == 1 && referenceList[5] == 1){
            ivR.setImageResource(R.drawable.ic_345)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[6] == 0 && referenceList[7] == 0 && referenceList[8] == 0){
            ivR.setImageResource(R.drawable.ic_678)
            gameResultDialog("You Win!")
        }
        if(referenceList[6] == 1 && referenceList[7] == 1 && referenceList[8] == 1){
            ivR.setImageResource(R.drawable.ic_678)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[0] == 0 && referenceList[3] == 0 && referenceList[6] == 0){
            ivR.setImageResource(R.drawable.ic_036)
            gameResultDialog("You Win!")
        }
        if(referenceList[0] == 1 && referenceList[3] == 1 && referenceList[6] == 1){
            ivR.setImageResource(R.drawable.ic_036)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[1] == 0 && referenceList[4] == 0 && referenceList[7] == 0){
            ivR.setImageResource(R.drawable.ic_147)
            gameResultDialog("You Win!")
        }
        if(referenceList[1] == 1 && referenceList[4] == 1 && referenceList[7] == 1){
            ivR.setImageResource(R.drawable.ic_147)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[2] == 0 && referenceList[5] == 0 && referenceList[8] == 0){
            ivR.setImageResource(R.drawable.ic_258)
            gameResultDialog("You Win!")
        }
        if(referenceList[2] == 1 && referenceList[5] == 1 && referenceList[8] == 1){
            ivR.setImageResource(R.drawable.ic_258)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[0] == 0 && referenceList[4] == 0 && referenceList[8] == 0){
            ivR.setImageResource(R.drawable.ic_048)
            gameResultDialog("You Win!")
        }
        if(referenceList[0] == 1 && referenceList[4] == 1 && referenceList[8] == 1){
            ivR.setImageResource(R.drawable.ic_048)
            gameResultDialog("Computer Wins!")
        }

        if(referenceList[2] == 0 && referenceList[4] == 0 && referenceList[6] == 0){
            ivR.setImageResource(R.drawable.ic_246)
            gameResultDialog("You Win!")
        }
        if(referenceList[2] == 1 && referenceList[4] == 1 && referenceList[6] == 1){
            ivR.setImageResource(R.drawable.ic_246)
            gameResultDialog("Computer Wins!")
        }
    }

    private fun gameResultDialog(result: String){
        val mDialogBuilder = AlertDialog.Builder(this)
        mDialogBuilder.apply {
            setTitle(result)
            setPositiveButton("Start New Game") { _, _ ->
                finish()
                startActivity(Intent(this@OnePlayer, OnePlayer::class.java))
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