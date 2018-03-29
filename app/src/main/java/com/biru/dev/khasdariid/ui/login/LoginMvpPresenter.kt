package com.biru.dev.khasdariid.ui.login

import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.base.MvpPresenter


/**
 * Created by miftahun on 3/8/18.
 */

@PerActivity
interface LoginMvpPresenter<V : LoginMvpView> : MvpPresenter<V> {

}
