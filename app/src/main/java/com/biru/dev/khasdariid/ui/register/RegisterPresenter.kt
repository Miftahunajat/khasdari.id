package com.biru.dev.khasdariid.ui.register

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class RegisterPresenter<V : RegisterMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), RegisterMvpPresenter<V> {


    companion object {

        private val TAG = "RegisterPresenter"
    }

}
