package com.alchemist.angelsagao.fijc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.alchemist.angelsagao.databinding.ActivityMatrixBinding
import com.alchemist.angelsagao.ihuduhasdokx.SayAct


class MatrixAct : AppCompatActivity() {
    lateinit var bindMatrix: ActivityMatrixBinding
    var clickCount: Int = 0
//    val fadeIn: Animation? = AnimationUtils.loadAnimation(this, R.anim.fade_in)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindMatrix = com.alchemist.angelsagao.databinding.ActivityMatrixBinding.inflate(layoutInflater)
        setContentView(bindMatrix.root)

        val viewsList: ArrayList<View> = ArrayList()
        viewsList.add(bindMatrix.rose1)
        viewsList.add(bindMatrix.rose2)
        viewsList.add(bindMatrix.rose3)
        viewsList.add(bindMatrix.rose4)
        viewsList.add(bindMatrix.rose5)
        viewsList.add(bindMatrix.rose6)
        viewsList.add(bindMatrix.rose7)
        viewsList.add(bindMatrix.rose8)
        viewsList.add(bindMatrix.rose9)
        viewsList.add(bindMatrix.rose10)
        viewsList.add(bindMatrix.rose11)
        viewsList.add(bindMatrix.rose12)
        viewsList.add(bindMatrix.rose13)
        viewsList.add(bindMatrix.rose14)
        viewsList.add(bindMatrix.rose15)
        viewsList.add(bindMatrix.rose16)



        for (i in viewsList){
            i.setOnClickListener{
                it.isVisible = false
                clickCount++
                if (clickCount >= 16){
                    bindMatrix.krid.isVisible = true
                    bindMatrix.krid.setOnClickListener{
                        startActivity(Intent(this@MatrixAct, SayAct::class.java))
                        finish()
                    }
                }
            }

        }

    }

    fun whoAreYou(view: View) {
        Toast.makeText(this, "I am nobody and everybody. I am the abstract and the immaterial", Toast.LENGTH_SHORT).show()
    }
    fun noWayOut(view: View) {
        Toast.makeText(this, "No way out, buddy. No. Way. Out.", Toast.LENGTH_SHORT).show()
    }


}