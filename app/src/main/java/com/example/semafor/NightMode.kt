package com.example.semafor

import android.widget.ImageView

class NightMode(redView: ImageView, orangeView: ImageView, greenView: ImageView): Mode(1000) {

    override var red: ImageView = redView
    override var orange: ImageView = orangeView
    override var green: ImageView = greenView

    /**
     * funkcia pre blikanie oranzoveho svetla
     */
    fun setNightMode() {
        orange.setColorFilter(colorOrange)
        handler.postDelayed({
            orange.setColorFilter(colorGray);
        }, delay)
    }
}