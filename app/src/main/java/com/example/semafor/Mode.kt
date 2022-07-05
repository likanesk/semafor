package com.example.semafor

import android.graphics.Color
import android.os.Handler

abstract class Mode(var delay: Long) {
    val colorRed:Int = Color.parseColor(Colors.RED.rgb);
    val colorOrange:Int = Color.parseColor(Colors.ORANGE.rgb);
    val colorGreen:Int = Color.parseColor(Colors.GREEN.rgb);
    val colorGray:Int = Color.parseColor(Colors.GRAY.rgb);
    var handler = Handler()

    fun stop() {
        handler.removeCallbacksAndMessages(null)
    }
}