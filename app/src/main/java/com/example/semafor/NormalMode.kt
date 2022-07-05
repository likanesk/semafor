package com.example.semafor

import android.graphics.Color
import android.os.Handler
import android.widget.ImageView
import kotlin.math.max

class NormalMode: Mode(5000) {

    fun setNormalMode(red: ImageView, orange: ImageView, green: ImageView) {

        //TODO: Infinity loop with exception
        for (i in 1..5) {
            red.setColorFilter(colorRed)

            handler.postDelayed({
                red.setColorFilter(colorRed)
                orange.setColorFilter(colorOrange)
            }, delay)
            delay += 2000

            handler.postDelayed({
                red.setColorFilter(colorGray)
                orange.setColorFilter(colorGray)
                green.setColorFilter(colorGreen)
            }, delay)
            delay += 5000

            handler.postDelayed({
                red.setColorFilter(colorGray)
                orange.setColorFilter(colorOrange)
                green.setColorFilter(colorGray)
            }, delay)
            delay += 5000
        }

    }
}