package com.biru.dev.khasdariid.ui.base


import com.biru.dev.khasdariid.data.DataManager
import io.reactivex.disposables.CompositeDisposable

import javax.inject.Inject

/**
* Created by miftahun on 3/8/18.
*
* @Author Miftahun Najat
* @Email miftahunajat@gmail.com
* @Github https://github.com/miftahunajat
*/

open class BasePresenter<V : MvpView> @Inject internal
constructor(val appDataManager: DataManager,
            val compositeDisposable: CompositeDisposable) : MvpPresenter<V> {

    private var mvpView: V? = null
    private val isViewAttached: Boolean get() = mvpView != null

    override fun onAttach(view: V) {
        this.mvpView = view
    }

    override fun onDetach() {
        mvpView = null
        compositeDisposable.dispose()
    }

    override fun getView(): V? {
        return mvpView
    }
}
