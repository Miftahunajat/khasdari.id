package com.biru.dev.khasdariid.ui.main


/**
 * Created by miftahun on 3/8/18.
 */

@PerActivity
interface MainMvpPresenter<V : MainMvpView> : MvpPresenter<V> {

    fun onDoSomething()

}
