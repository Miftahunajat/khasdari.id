package com.biru.dev.khasdariid.ui.detailrute

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailRutePresenter<V : DetailRuteMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), DetailRuteMvpPresenter<V> {


    companion object {

        private val TAG = "DetailRutePresenter"
    }

}
