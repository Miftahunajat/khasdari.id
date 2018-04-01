package com.biru.dev.khasdariid.utils

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BitmapFactory.decodeResource

/**
 * Created by miftahun on 4/1/18.
 */

object BitmapUtils {

    fun calculateInSampleSize(options: BitmapFactory.Options, reqwidth: Int, reqHeight: Int): Int{

        val height = options.outHeight
        val width = options.outWidth
        var sampleSize = 1

        if (height > reqHeight || width > reqwidth ){

            val halfHeight = height / 2
            val halfWidth = width / 2

            while ((halfHeight / sampleSize) >= reqHeight
                    && (halfWidth / sampleSize) >= reqwidth){
                sampleSize*=2
            }
        }
        return sampleSize
    }

    fun decodeSampledBitmapFromResource(res: Resources, resId: Int,
                                        reqwidth: Int, reqHeight: Int): Bitmap {

        val options: BitmapFactory.Options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeResource(res, resId, options)

        options.inSampleSize = calculateInSampleSize(options, reqwidth, reqHeight)

        options.inJustDecodeBounds = false
        return BitmapFactory.decodeResource(res, resId, options)
    }
}