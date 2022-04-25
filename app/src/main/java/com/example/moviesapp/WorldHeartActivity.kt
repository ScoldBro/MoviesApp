package com.example.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

class WorldHeartActivity : AppCompatActivity() {

    lateinit var checkBox: CheckBox
    lateinit var eyeView: View
    lateinit var shareButton: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_heart)

        var setCheckBox: Boolean? = null

        checkBox = findViewById(R.id.world_heart_cb)
        eyeView = findViewById(R.id.eye_world_heart)

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                eyeView.setVisibility(View.VISIBLE)
            } else {
                eyeView.setVisibility(View.INVISIBLE)
            }
        }

        shareButton = findViewById(R.id.shareWorldHeart)
        shareButton.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Давай смотреть вместе Сердце Мира")
            sendIntent.type = "text/plain"
            startActivity(Intent.createChooser(sendIntent, "Поделиться"))
        }


    }
}