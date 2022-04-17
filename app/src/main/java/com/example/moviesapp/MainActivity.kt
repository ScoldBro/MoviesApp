package com.example.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.imageView1).setOnClickListener{
            val intent = Intent(this, AvatarDescriptionActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView2).setOnClickListener{
            val intent = Intent(this, BabyDriverActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView3).setOnClickListener{
            val intent = Intent(this, MatrixActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView4).setOnClickListener{
            val intent = Intent(this, MainHeroActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView5).setOnClickListener{
            val intent = Intent(this, WorldHeartActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView6).setOnClickListener{
            val intent = Intent(this, DeadpoolActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView7).setOnClickListener{
            val intent = Intent(this, AvatarDescriptionActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.imageView8).setOnClickListener{
            val intent = Intent(this, BabyDriverActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.imageView9).setOnClickListener{
            val intent = Intent(this, MatrixActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.imageView10).setOnClickListener{
            val intent = Intent(this, MainHeroActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.imageView11).setOnClickListener{
            val intent = Intent(this, WorldHeartActivity::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.imageView12).setOnClickListener{
            val intent = Intent(this, DeadpoolActivity::class.java)
            startActivity(intent)
        }
    }
}