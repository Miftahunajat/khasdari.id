package com.biru.dev.khasdariid.ui.detaildeskripsi

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailDeskripsiPresenter<V : DetailDeskripsiMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), DetailDeskripsiMvpPresenter<V> {


    companion object {

        private val TAG = "DetailDeskripsiPresenter"
    }

}
