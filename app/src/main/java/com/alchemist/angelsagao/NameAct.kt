package com.alchemist.angelsagao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NameAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
    }

    fun moveToNEXT(view: View) {
        startActivity(Intent(this@NameAct, SayMyNameActy::class.java))
        finish()
    }
}