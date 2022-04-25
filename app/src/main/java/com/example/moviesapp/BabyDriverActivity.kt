package com.example.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.CheckBox

class BabyDriverActivity : AppCompatActivity() {

    lateinit var checkBox: CheckBox
    lateinit var eyeView: View
    lateinit var shareButton: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baby_driver)

        var setCheckBox: Boolean? = null

        checkBox = findViewById(R.id.babyDriver_cb)
        eyeView = findViewById(R.id.eye_baby_driver)

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                eyeView.setVisibility(View.VISIBLE)
            } else {
                eyeView.setVisibility(View.INVISIBLE)
            }
        }

        shareButton = findViewById(R.id.shareBabyDriver)
        shareButton.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Давай смотреть вместе Baby Driver")
            sendIntent.type = "text/plain"
            startActivity(Intent.createChooser(sendIntent, "Поделиться"))
        }

    }
}