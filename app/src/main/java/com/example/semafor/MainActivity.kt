package com.example.semafor

import android.R.id.button1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var trafficLight: TrafficLight = TrafficLight(redView, orangeView, greenView)

        stopButton.setOnClickListener() {
            trafficLight.setPowerStatus()
        }

        playButton.setOnClickListener() {
            trafficLight.useNormalMode()
            //automaticke spustanie tlacidla (neustale opakovanie cyklu po 17 sek.)
            trafficLight.normal.handler.postDelayed(Runnable { playButton.performClick() }, 17000)
        }

        pauseButton.setOnClickListener() {
            trafficLight.useNightMode()
            //automaticke spustanie tlacidla (neustale opakovanie cyklu po 2 sek.)
            trafficLight.night.handler.postDelayed(Runnable { pauseButton.performClick() }, 2000)
        }

    }

}

