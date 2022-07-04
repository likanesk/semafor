package com.example.semafor

import android.graphics.Color
import android.widget.ImageView
import android.os.Handler
import com.example.semafor.Colors

class NightMode {

    /**
     * funkcia pre blikanie oranzoveho svetla
     */
    fun setNightMode(orange: ImageView) {
        val colorOrange:Int = Color.parseColor(Colors.ORANGE.rgb);
        val colorGray:Int = Color.parseColor(Colors.GRAY.rgb);

        var handler = Handler()

        orange.setColorFilter(colorOrange)
        handler.postDelayed({
            orange.setColorFilter(colorGray);
        }, 1000)

    }
}