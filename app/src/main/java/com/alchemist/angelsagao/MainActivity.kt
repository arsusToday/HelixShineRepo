package com.alchemist.angelsagao

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alchemist.angelsagao.eowek.Uqoqoisjxuhcsgy
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val viewMainModel by viewModel <Uqoqoisjxuhcsgy>(named("MainModel"))

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewMainModel.eokkowkokodokdoksajijxcijzc(this@MainActivity)
    }
}