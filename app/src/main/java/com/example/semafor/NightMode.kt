package com.example.semafor

import android.graphics.Color
import android.widget.ImageView
import android.os.Handler
import com.example.semafor.Colors

class NightMode {
    var handler = Handler()

    /**
     * funkcia pre blikanie oranzoveho svetla
     */
    fun setNightMode(orange: ImageView) {
        val colorOrange:Int = Color.parseColor(Colors.ORANGE.rgb);
        val colorGray:Int = Color.parseColor(Colors.GRAY.rgb);

        orange.setColorFilter(colorOrange)
        handler.postDelayed({
            orange.setColorFilter(colorGray);
        }, 1000)
    }

    fun stop() {
        handler.removeCallbacksAndMessages(null)
    }
}