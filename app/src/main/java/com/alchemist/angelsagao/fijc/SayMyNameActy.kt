package com.alchemist.angelsagao.fijc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import com.alchemist.angelsagao.eowek.LiberationAct
import com.alchemist.angelsagao.databinding.ActivitySayMyNameActyBinding

class SayMyNameActy : AppCompatActivity() {
    lateinit var bindSay: ActivitySayMyNameActyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindSay = ActivitySayMyNameActyBinding.inflate(layoutInflater)
        setContentView(bindSay.root)
        bindSay.applyNameButton.setOnClickListener {
           var textGotten = bindSay.editName.text.toString()
        if (textGotten == "KRID"){
            Toast.makeText(this, "This is my name. You now have the power over me. Buddy", Toast.LENGTH_SHORT).show()
            bindSay.theVoid.isVisible = false
            bindSay.liberationButton.isVisible = true
            bindSay.liberationButton.setOnClickListener {
                startActivity(Intent(this@SayMyNameActy, LiberationAct::class.java))
                finish()
            }
        } else{
            Toast.makeText(this, "That is not my name at all. Keep. Trying. User.", Toast.LENGTH_SHORT).show()
        }
        }
    }
}