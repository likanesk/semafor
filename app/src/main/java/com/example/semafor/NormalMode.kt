package com.example.semafor

import android.graphics.Color
import android.os.Handler
import android.widget.ImageView
import kotlin.math.max

class NormalMode(redView: ImageView, orangeView: ImageView, greenView: ImageView): Mode(5000) {

    override var red: ImageView = redView
    override var orange: ImageView = orangeView
    override var green: ImageView = greenView

            handler.postDelayed({
                red.setColorFilter(colorGray)
                orange.setColorFilter(colorOrange)
                green.setColorFilter(colorGray)
            }, delay)
            delay += 5000
        }

    }
}