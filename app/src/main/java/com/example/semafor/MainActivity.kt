package com.example.semafor

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import android.os.Handler
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nightMode: NightMode = NightMode()

        /*pauseButton.setOnClickListener() {
            repeat(10) {
                nightMode.setNightMode(orangeView)
            }
        }*/

        pauseButton.setOnClickListener() {
            nightMode.setNightMode(orangeView)
        }

        val normalMode: NormalMode = NormalMode()

        playButton.setOnClickListener() {
            normalMode.setNormalMode(redView, orangeView, greenView)
        }

    }

}

