package com.biru.dev.khasdariid.ui.home

import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.base.MvpPresenter


/**
 * Created by miftahun on 3/8/18.
 */

@PerActivity
interface HomeMvpPresenter<V : HomeMvpView> : MvpPresenter<V> {

}
