package com.example.semafor

import android.graphics.Color
import android.os.Handler
import android.widget.ImageView
import kotlin.math.max

class NormalMode(redView: ImageView, orangeView: ImageView, greenView: ImageView): Mode(5000) {

    override var red: ImageView = redView
    override var orange: ImageView = orangeView
    override var green: ImageView = greenView

    fun start() {
        runnable.run()
    }

    var runnable: Runnable = object : Runnable{
        override fun run() {
            runnable1.run()
            runnable2.run()
            runnable3.run()
        }
    }

    var runnable1: Runnable = object : Runnable {
        override fun run() {
            red.setColorFilter(colorRed)
            handler.postDelayed(
                {
                    red.setColorFilter(colorRed)
                    orange.setColorFilter(colorOrange)
                }, delay
            )
            delay += 2000
        }
    }

    var runnable2: Runnable = object : Runnable {
        override fun run() {
            handler.postDelayed({
                red.setColorFilter(colorGray)
                orange.setColorFilter(colorGray)
                green.setColorFilter(colorGreen)
            }, delay)
            delay += 5000
        }
    }

    var runnable3: Runnable = object : Runnable {
        override fun run() {
            handler.postDelayed({
                red.setColorFilter(colorGray)
                orange.setColorFilter(colorOrange)
                green.setColorFilter(colorGray)
            }, delay)
            delay = 5000
        }
    }
}