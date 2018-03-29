package com.biru.dev.khasdariid.ui.splash

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class SplashPresenter<V : SplashMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), SplashMvpPresenter<V> {


    override fun onAttach(view: V) {
        super.onAttach(view)

        getView()?.hideStatusBar()
    }

    companion object {

        private val TAG = "SplashPresenter"
    }

}
