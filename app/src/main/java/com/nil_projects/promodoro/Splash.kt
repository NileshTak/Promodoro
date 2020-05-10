package com.nil_projects.promodoro

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Splash : AppCompatActivity() {

    lateinit var tvSplash: TextView
    lateinit var tvSubSplash : TextView
    lateinit var btnGet : Button
    lateinit var atg : Animation
    lateinit var atgone : Animation
    lateinit var atgtwo : Animation
    lateinit var ivSplash : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        ivSplash = findViewById<ImageView>(R.id.ivSplash)
        tvSplash = findViewById<TextView>(R.id.tvSplash)
        tvSubSplash = findViewById<TextView>(R.id.tvSubSplash)
        btnGet = findViewById<Button>(R.id.btnGet)

        atg = AnimationUtils.loadAnimation(this,R.anim.atg)
        atgone = AnimationUtils.loadAnimation(this,R.anim.atgone)
        atgtwo = AnimationUtils.loadAnimation(this,R.anim.atgtwo)
        ivSplash.startAnimation(atg)
        tvSplash.startAnimation(atgone)
        tvSubSplash.startAnimation(atgone)
        btnGet.startAnimation(atgtwo)

        var MLight = Typeface.createFromAsset(assets,"fonts/MLight.ttf")
        var MMedium = Typeface.createFromAsset(assets,"fonts/MMedium.ttf")
        var MRegular = Typeface.createFromAsset(assets,"fonts/MRegular.ttf")

        tvSplash.setTypeface(MRegular)
        tvSubSplash.setTypeface(MLight)
        btnGet.setTypeface(MMedium)

        btnGet.setOnClickListener {
            var int = Intent(this,MainActivity :: class.java)
            int.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(int)
        }
    }
}
