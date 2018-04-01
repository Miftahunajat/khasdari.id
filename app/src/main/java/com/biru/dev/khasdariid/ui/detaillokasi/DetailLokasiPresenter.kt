package com.biru.dev.khasdariid.ui.detaillokasi

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class DetailLokasiPresenter<V : DetailLokasiMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), DetailLokasiMvpPresenter<V> {


    companion object {

        private val TAG = "DetailLokasiPresenter"
    }

}
