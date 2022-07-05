package com.example.semafor

import android.graphics.Color
import android.widget.ImageView

class TrafficLight(red: ImageView, orange: ImageView, green: ImageView) {

    var powerOn = false;
    val redLight = red
    val orangeLight = orange
    val greenLight = green

    val normal :NormalMode = NormalMode()
    val night : NightMode = NightMode()

    //funkcia pre zapnutie normalneho(denneho) modu, ak je semafor zapnuty
    fun useNormalMode() {
        if (powerOn) {
            normal.setNormalMode(redLight, orangeLight, greenLight)
        }
    }

    //funkcia pre zapnutie nocneho modu, ak je semafor zapnuty
    fun useNightMode() {
        if (powerOn) {
            night.setNightMode(orangeLight)
        }
    }

    //funkcia nastavi semafor na vypnuty/zapnuty
    fun setPower() {
        if (powerOn) {
            normal.stop()
            night.stop()
            powerOn = false
            redLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
            orangeLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
            greenLight.setColorFilter(Color.parseColor(Colors.GRAY.rgb))
        } else {
            powerOn = true
        }
    }
}

