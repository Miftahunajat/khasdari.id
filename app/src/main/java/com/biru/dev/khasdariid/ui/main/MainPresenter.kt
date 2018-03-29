package com.biru.dev.khasdariid.ui.main


/**
 * Created by miftahun on 3/8/18.
 */

class MainPresenter<V : MainMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), MainMvpPresenter<V> {


    companion object {

        private val TAG = "MainPresenter"
    }

}
