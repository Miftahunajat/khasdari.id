package com.biru.dev.khasdariid.ui.placedetail

import com.biru.dev.khasdariid.ui.base.MvpView


/**
 * Created by miftahun on 3/8/18.
 */

interface PlaceDetailMvpView : MvpView {

    fun setupSlider(photos: List<Int>)

    fun setTitleName(name:String)
}
