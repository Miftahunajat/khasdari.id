package com.biru.dev.khasdariid.ui.detaillokasi

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailLokasiPresenter<V : DetailLokasiMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), DetailLokasiMvpPresenter<V> {


    companion object {

        private val TAG = "DetailLokasiPresenter"
    }

}
