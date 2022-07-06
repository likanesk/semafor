package com.example.semafor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val trafficLight = TrafficLight(redView, orangeView, greenView)

        stopButton.setOnClickListener {
            trafficLight.setPowerStatus()
            trafficLight.night.stop()
            trafficLight.normal.stop()
        }

        playButton.setOnClickListener {
            trafficLight.useNormalMode()
            //automaticke spustanie tlacidla (neustale opakovanie cyklu po 17 sek.)
            trafficLight.normal.handler.postDelayed({ playButton.performClick() }, 17000)
        }

        pauseButton.setOnClickListener {
            trafficLight.useNightMode()
            //automaticke spustanie tlacidla (neustale opakovanie cyklu po 2 sek.)
            trafficLight.night.handler.postDelayed({ pauseButton.performClick() }, 2000)
        }

    }

}

