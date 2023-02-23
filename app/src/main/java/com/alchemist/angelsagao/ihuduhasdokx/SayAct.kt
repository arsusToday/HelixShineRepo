package com.alchemist.angelsagao.ihuduhasdokx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alchemist.angelsagao.fijc.MyAct
import com.alchemist.angelsagao.R

class SayAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_say)
    }

    fun moveToMY(view: View) {
        startActivity(Intent(this@SayAct, MyAct::class.java))
        finish()
    }
}