package com.biru.dev.khasdariid.ui.base

import android.support.annotation.StringRes

/**
 * Created by miftahun on 3/8/18.
 */

interface MvpView {

    val isNetworkConnected: Boolean

    fun showLoading()

    fun hideLoading()

    fun openActivityOnTokenExpire()

    fun onError(@StringRes resId: Int)

    fun onError(message: String)

    fun showMessage(message: String)

    fun showMessage(@StringRes resId: Int)

    fun hideKeyboard()

    fun setOnClickListeners()
}
