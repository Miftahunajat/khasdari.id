package com.biru.dev.khasdariid.ui.detailrute

import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.base.MvpPresenter


/**
 * Created by miftahun on 3/8/18.
 */

@PerActivity
interface DetailRuteMvpPresenter<V : DetailRuteMvpView> : MvpPresenter<V> {

    fun onDoSomething()

}
