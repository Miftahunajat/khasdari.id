package com.biru.dev.khasdariid.ui.main

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class MainPresenter<V : MainMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), MainMvpPresenter<V> {

    override fun onAttach(view: V) {
        super.onAttach(view)

        getView()?.loadHomeFragment()
    }

    companion object {

        private val TAG = "MainPresenter"
    }

    override fun onHomeClicked() {
        getView()?.loadHomeFragment()
    }

    override fun onBookmarkClicked() {
        getView()?.loadBookmarkFragment()
    }

    override fun onOlehOlehClicked() {
        getView()?.loadOlehOlehFragment()
    }

    override fun onWisataClicked() {
        getView()?.loadWisataFragment()
    }

    override fun onUserInfoClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
