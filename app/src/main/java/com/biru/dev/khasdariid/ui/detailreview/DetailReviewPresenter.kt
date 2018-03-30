package com.biru.dev.khasdariid.ui.detailreview

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailReviewPresenter<V : DetailReviewMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), DetailReviewMvpPresenter<V> {


    companion object {

        private val TAG = "DetailReviewPresenter"
    }

}
