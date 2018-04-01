package com.biru.dev.khasdariid.ui.splash

import com.biru.dev.khasdariid.ui.base.MvpView


/**
 * Created by miftahun on 3/8/18.
 */

interface SplashMvpView : MvpView {

    fun openLoginActivity()

    fun updateProgress(int: Int)
}
