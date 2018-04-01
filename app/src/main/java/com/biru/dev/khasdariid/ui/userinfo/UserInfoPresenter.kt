package com.biru.dev.khasdariid.ui.userinfo

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class UserInfoPresenter<V : UserInfoMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), UserInfoMvpPresenter<V> {


    companion object {

        private val TAG = "UserInfoPresenter"
    }

}
