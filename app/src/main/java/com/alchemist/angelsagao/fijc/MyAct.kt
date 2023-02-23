package com.alchemist.angelsagao.fijc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alchemist.angelsagao.R
import com.alchemist.angelsagao.ihuduhasdokx.NameAct

class MyAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
    }

    fun moveToName(view: View) {
        startActivity(Intent(this@MyAct, NameAct::class.java))
        finish()
    }
}