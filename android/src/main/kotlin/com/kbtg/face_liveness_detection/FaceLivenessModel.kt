package com.kbtg.face_liveness_detection

import android.graphics.Bitmap
import android.graphics.BitmapFactory

class FaceLivenessModel(
    private val listener: FaceLivenessListener,
) {
    private var counter = 0;

    fun receive(image: ByteArray) {
        counter = counter + 1;
        if (counter > 200) {
            listener.onDetectOver(image, "OK");
        }
    }
}
