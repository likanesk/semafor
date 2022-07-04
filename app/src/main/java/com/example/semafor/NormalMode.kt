package com.example.semafor

import android.graphics.Color
import android.os.Handler
import android.widget.ImageView
import kotlin.math.max

class NormalMode {
    val colorRed:Int = Color.parseColor(Colors.RED.rgb);
    val colorOrange:Int = Color.parseColor(Colors.ORANGE.rgb);
    val colorGreen:Int = Color.parseColor(Colors.GREEN.rgb);
    val colorGray:Int = Color.parseColor(Colors.GRAY.rgb);

    fun setNormalMode(red: ImageView, orange: ImageView, green: ImageView) {
        var handler = Handler()
        var delay:Long = 5000

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