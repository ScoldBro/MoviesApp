package com.example.moviesapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private var red = 0
    private var green = 0
    private var blue = 0

    private lateinit var inputAvatar:TextView
    private lateinit var inputBabyDriver:TextView
    private lateinit var inputMatrix:TextView
    private lateinit var inputMainHero:TextView
    private lateinit var inputWorldHeart:TextView
    private lateinit var inputDeadpool:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonAvatarPoster).setOnClickListener {
            val intent = Intent(this, AvatarDescriptionActivity::class.java)
            startActivity(intent)
        }

        red = savedInstanceState?.getInt("colorRed", 0) ?: 0
        green = savedInstanceState?.getInt("colorGreen", 0) ?: 0
        blue = savedInstanceState?.getInt("colorBlue", 0) ?: 0

        inputAvatar = findViewById(R.id.textAvatarMain)
        inputAvatar.setTextColor(Color.rgb(red,green,blue))

        findViewById<View>(R.id.buttonAvatarPoster).setOnLongClickListener {
            red = randomColor()
            green = randomColor()
            blue = randomColor()
            inputAvatar.setTextColor(Color.rgb(red,green,blue))
            return@setOnLongClickListener true
        }


        inputBabyDriver = findViewById(R.id.textBabyDriverMain)
        inputBabyDriver.setTextColor(Color.rgb(red,green,blue))

        findViewById<Button>(R.id.buttonBabyDriverPoster).setOnClickListener {
            val intent = Intent(this, BabyDriverActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.buttonBabyDriverPoster).setOnLongClickListener {
            red = randomColor()
            green = randomColor()
            blue = randomColor()
            inputBabyDriver.setTextColor(Color.rgb(red,green,blue))
            return@setOnLongClickListener true
        }


        inputMatrix = findViewById(R.id.textMatrixMain)
        inputMatrix.setTextColor(Color.rgb(red,green,blue))

        findViewById<Button>(R.id.buttonMatrixPoster).setOnClickListener {
            val intent = Intent(this, MatrixActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.buttonMatrixPoster).setOnLongClickListener {
            red = randomColor()
            green = randomColor()
            blue = randomColor()
            inputMatrix.setTextColor(Color.rgb(red,green,blue))
            return@setOnLongClickListener true
        }


        inputMainHero = findViewById(R.id.textMainHeroMain)
        inputMainHero.setTextColor(Color.rgb(red,green,blue))

        findViewById<Button>(R.id.buttonMainHeroPoster).setOnClickListener {
            val intent = Intent(this, MainHeroActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.buttonMainHeroPoster).setOnLongClickListener {
            red = randomColor()
            green = randomColor()
            blue = randomColor()
            inputMainHero.setTextColor(Color.rgb(red,green,blue))
            return@setOnLongClickListener true
        }


        inputWorldHeart = findViewById(R.id.textWorldHeartMain)
        inputWorldHeart.setTextColor(Color.rgb(red,green,blue))

        findViewById<Button>(R.id.buttonWorldHeartPoster).setOnClickListener {
            val intent = Intent(this, WorldHeartActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.buttonWorldHeartPoster).setOnLongClickListener {
            red = randomColor()
            green = randomColor()
            blue = randomColor()
            inputWorldHeart.setTextColor(Color.rgb(red,green,blue))
            return@setOnLongClickListener true
        }

        inputDeadpool = findViewById(R.id.textDeadpoolMain)
        inputDeadpool.setTextColor(Color.rgb(red,green,blue))

        findViewById<Button>(R.id.buttonDeadpoolPoster).setOnClickListener {
            val intent = Intent(this, DeadpoolActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.buttonDeadpoolPoster).setOnLongClickListener {
            red = randomColor()
            green = randomColor()
            blue = randomColor()
            inputDeadpool.setTextColor(Color.rgb(red,green,blue))
            return@setOnLongClickListener true
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("colorRed", red)
        outState.putInt("colorGreen", green)
        outState.putInt("colorBlue", blue)
    }


    fun randomColor(): Int {
        return (0..255).random()
    }

}
