package com.biru.dev.khasdariid.ui.detailrute

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailRutePresenter<V : DetailRuteMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), DetailRuteMvpPresenter<V> {

    override fun onDoSomething() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {

        private val TAG = "DetailRutePresenter"
    }

}
