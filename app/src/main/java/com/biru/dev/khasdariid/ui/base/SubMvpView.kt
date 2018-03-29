package com.biru.dev.khasdariid.ui.base

/**
 * Created by miftahun on 3/8/18.
 */

interface SubMvpView : MvpView {
    fun onCreate()

    fun onStart()

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()

    fun attachParentMvpView(mvpView: MvpView)
}
