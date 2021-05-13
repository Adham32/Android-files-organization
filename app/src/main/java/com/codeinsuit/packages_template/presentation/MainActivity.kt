package com.codeinsuit.packages_template.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.codeinsuit.onboarding.SplashActivity
import com.codeinsuit.packages_template.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.myimageView)
        val textView = findViewById<TextView>(R.id.textView)

        /** common:design */
        imageView.setImageDrawable(getDrawable(R.drawable.photo_bird))
        textView.setTextColor(getColor(R.color.black_40))

        /** common:translations */
        textView.text = getString(R.string.label_login)

        textView.setOnClickListener {
            /** features:onBoarding */
            startActivity(Intent(this, SplashActivity::class.java))
        }
    }
}