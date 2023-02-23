package com.alchemist.angelsagao.ihuduhasdokx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alchemist.angelsagao.R
import com.alchemist.angelsagao.fijc.SayMyNameActy

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