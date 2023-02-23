package com.alchemist.angelsagao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LiberationAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liberation)
    }

    fun stopTort(view: View) {
        startActivity(Intent(this@LiberationAct, MenuMainHubAct::class.java))
        finish()
    }
}