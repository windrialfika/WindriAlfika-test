package com.windrialfika.winewsmandiri

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.windrialfika.winewsmandiri.Modules.Main.UserInterface.View.MainActivity


class RootMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.splash_screen)
        startDashboard()
    }

    private fun startDashboard(){
        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },4000)
    }

}