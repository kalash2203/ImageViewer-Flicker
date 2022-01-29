package com.example.android.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.example.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_photo_v.*

class PhotoV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_v)

        var url =  intent.getStringExtra("photourl")

        if (url != null) {
            Picasso.get().
            load(url)
                .into(image_full)
        }
    }
}