package com.biru.dev.khasdariid.ui.main

import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.base.MvpPresenter


/**
 * Created by miftahun on 3/8/18.
 */

@PerActivity
interface MainMvpPresenter<V : MainMvpView> : MvpPresenter<V> {

}
