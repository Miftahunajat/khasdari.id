package com.biru.dev.khasdariid.ui.home

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class HomePresenter<V : HomeMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), HomeMvpPresenter<V> {


    companion object {

        private val TAG = "HomePresenter"
    }

}
