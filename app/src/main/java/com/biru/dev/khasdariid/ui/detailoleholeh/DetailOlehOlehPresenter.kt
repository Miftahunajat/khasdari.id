package com.biru.dev.khasdariid.ui.detailoleholeh

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailOlehOlehPresenter<V : DetailOlehOlehMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), DetailOlehOlehMvpPresenter<V> {


    companion object {

        private val TAG = "DetailOlehOlehPresenter"
    }

}
