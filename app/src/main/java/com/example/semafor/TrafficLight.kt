package com.example.semafor

import android.graphics.Color
import android.widget.ImageView

class TrafficLight(red: ImageView, orange: ImageView, green: ImageView) {

    var powerOn = false;
    val redLight = red
    val orangeLight = orange
    val greenLight = green

    val normal :NormalMode = NormalMode(redLight, orangeLight, greenLight)
    val night : NightMode = NightMode(redLight, orangeLight, greenLight)

    //funkcia pre zapnutie normalneho(denneho) modu, ak je semafor zapnuty
    fun useNormalMode() {
        if (powerOn) {
            normal.stop()
            night.stop()
            setBasicLights()
            normal.start()
        }
    }

    //funkcia pre zapnutie nocneho modu, ak je semafor zapnuty
    fun useNightMode() {
        if (powerOn) {
            normal.stop()
            night.stop()
            setBasicLights()
            night.setNightMode()
        }
    }

    //funkcia nastavi semafor na vypnuty/zapnuty
    fun setPower() {
        if (powerOn) {
            normal.stop()
            night.stop()
            powerOn = false
            setBasicLights()
        } else {
            powerOn = true
        }
    }

    fun setBasicLights() {
        redLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
        orangeLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
        greenLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
    }
}

