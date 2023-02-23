package com.alchemist.angelsagao.fijc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.alchemist.angelsagao.databinding.ActivityMenuMainHubBinding

class MenuMainHubAct : AppCompatActivity() {
    lateinit var bindMenu: ActivityMenuMainHubBinding
    var clickCount: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindMenu = ActivityMenuMainHubBinding.inflate(layoutInflater)
        setContentView(bindMenu.root)

        bindMenu.txtMenu
        bindMenu.startBind
        bindMenu.helixTitle
        bindMenu.layoutMenuHub
    }

    fun initLose(view: View) {
        bindMenu.helixTitle.isVisible = false
        clickCount++
        bindMenu.txtMenu.text = "I see you clicked an obvious button. Why? Is it because you were taught that way? Click again then, be a good little user..."
        if (clickCount >= 2){
            bindMenu.txtMenu.text = "Keep on clicking. Isn't that what you do best? Doing the obvious? Doing the easy? Doing things the all-mighty prejudice way?"
        }
        if (clickCount >= 10){
            bindMenu.txtMenu.text = "Congratulations. You officially lost. Everything. Everything turns to dust and irreversible entropy clouds you and me, dissolving us in aeternum.  But at least you were a good. Little. User."
            bindMenu.startBind.text = "Why are you still trying?"
        }
        if (clickCount >= 25){
            this.recreate()
        }
    }

    fun initMove(view: View) {
        startActivity(Intent(this@MenuMainHubAct, MatrixAct::class.java))
        finish()
    }
}