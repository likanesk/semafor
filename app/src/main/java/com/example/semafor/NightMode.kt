package com.example.semafor

import android.graphics.Color
import android.widget.ImageView
import android.os.Handler
import com.example.semafor.Colors

class NightMode: Mode(1000) {

    /**
     * funkcia pre blikanie oranzoveho svetla
     */
    fun setNightMode(orange: ImageView) {

        orange.setColorFilter(colorOrange)
        handler.postDelayed({
            orange.setColorFilter(colorGray);
        }, delay)
    }

}