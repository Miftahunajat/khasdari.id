package com.biru.dev.khasdariid.ui.base

/**
 * Created by miftahun on 3/8/18.
 */

interface MvpPresenter<V : MvpView> {

    fun onAttach(view: V)

    fun onDetach()

    fun getView(): V?


}
