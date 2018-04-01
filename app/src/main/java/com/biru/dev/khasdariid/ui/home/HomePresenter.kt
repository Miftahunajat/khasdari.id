package com.biru.dev.khasdariid.ui.home

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class HomePresenter<V : HomeMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), HomeMvpPresenter<V> {

    override fun onLoadWisataPopular() {
        compositeDisposable.add(appDataManager.getListWisata()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    getView()?.displayPlacePopularList(it)
                })
    }

    override fun onLoadOlehOlehPopuler() {
        compositeDisposable.add(appDataManager.getListOlehOleh()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    getView()?.displayOlehOlehList(it)
                })
    }

    companion object {

        private val TAG = "HomePresenter"
    }

}
