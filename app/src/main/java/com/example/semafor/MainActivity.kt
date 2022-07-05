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

        var trafficLight: TrafficLight = TrafficLight(redView, orangeView, greenView)

        stopButton.setOnClickListener() {
            trafficLight.setPower()
        }

        playButton.setOnClickListener() {
            trafficLight.useNormalMode()
        }

        pauseButton.setOnClickListener() {
            trafficLight.useNightMode()
        }

    }

}

