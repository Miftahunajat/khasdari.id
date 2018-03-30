package com.biru.dev.khasdariid.ui.placedetail

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class PlaceDetailPresenter<V : PlaceDetailMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), PlaceDetailMvpPresenter<V> {


    companion object {

        private val TAG = "PlaceDetailPresenter"
    }

}
