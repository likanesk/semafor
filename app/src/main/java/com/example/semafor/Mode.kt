package com.example.semafor

import android.graphics.Color
import android.os.Handler
import android.widget.ImageView

abstract class Mode(var delay: Long) {
    val colorRed:Int = Color.parseColor(Colors.RED.rgb);
    val colorOrange:Int = Color.parseColor(Colors.ORANGE.rgb);
    val colorGreen:Int = Color.parseColor(Colors.GREEN.rgb);
    val colorGray:Int = Color.parseColor(Colors.GRAY.rgb);
    var handler = Handler()

    abstract var red: ImageView
    abstract var orange: ImageView
    abstract var green: ImageView

    fun stop() {
        handler.removeCallbacksAndMessages(null)
    }
}