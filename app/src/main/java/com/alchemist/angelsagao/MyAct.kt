package com.alchemist.angelsagao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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