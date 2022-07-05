package com.example.semafor

import android.graphics.Color
import android.widget.ImageView

class TrafficLight(red: ImageView, orange: ImageView, green: ImageView) {

    var powerStatus = false
    val redLight = red
    val orangeLight = orange
    val greenLight = green

    val normal :NormalMode = NormalMode(redLight, orangeLight, greenLight)
    val night : NightMode = NightMode(redLight, orangeLight, greenLight)

    /**
     * funkcia pre zapnutie normalneho(denneho) rezimu, ak je semafor zapnuty
     */
    fun useNormalMode() {
        if (powerStatus) {
            normal.stop()
            night.stop()
            setBasicLights()
            normal.start()
        }
    }

    /**
     * funkcia pre zapnutie nocneho rezimu, ak je semafor zapnuty
     */
    fun useNightMode() {
        if (powerStatus) {
            normal.stop()
            night.stop()
            setBasicLights()
            night.start()
        }
    }

    /**
     * funkcia, ktora nastavi semafor na vypnuty/zapnuty
     */
    fun setPowerStatus() {
        if (powerStatus) {
            normal.stop()
            night.stop()
            powerStatus = false
            setBasicLights()
        } else {
            powerStatus = true
        }
    }

    /**
     * funkcia pre nastavenie svetiel pri vypnutom semafore
     */
    fun setBasicLights() {
        redLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
        orangeLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
        greenLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
    }
}

