package com.biru.dev.khasdariid.ui.main

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class MainPresenter<V : MainMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), MainMvpPresenter<V> {

    override fun onAttach(view: V) {
        super.onAttach(view)

    }

    companion object {

        private val TAG = "MainPresenter"
    }

}
