package com.example.semafor

import android.graphics.Color
import android.os.Handler
import android.widget.ImageView
import kotlin.math.max

class NormalMode(redView: ImageView, orangeView: ImageView, greenView: ImageView): Mode(5000) {

    override var red: ImageView = redView
    override var orange: ImageView = orangeView
    override var green: ImageView = greenView

    override fun start() {
        runnable.run()
    }

    //pre vhodne nastavenie casovych okamihov
    var runnable: Runnable = object : Runnable{
        override fun run() {
            runnable1.run()
            runnable2.run()
            runnable3.run()
        }
    }

    //nastavenie cerveneho svetla a nasledne po 5 sekundach aj oranzoveho svetla
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

    //nastavenie zeleneho svetla a zrusenie cerveneho a oranzoveho
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

    //nastavenie oranzoveho svetla a zrusenie zeleneho
    var runnable3: Runnable = object : Runnable {
        override fun run() {
            handler.postDelayed({
                orange.setColorFilter(colorOrange)
                green.setColorFilter(colorGray)
            }, delay)
            delay = 5000
        }
    }
}