package com.biru.dev.khasdariid.ui.placedetail

import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.ui.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class PlaceDetailPresenter<V : PlaceDetailMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), PlaceDetailMvpPresenter<V> {


    override fun onAttach(view: V) {
        super.onAttach(view)

    }

    companion object {

        private val TAG = "PlaceDetailPresenter"
    }

    override fun loadDataWisata(id: Int) {
        compositeDisposable.add(appDataManager.getWisata(id)
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe {
                    getView()?.setupSlider(it.photo!!)
                    getView()?.setTitleName(it.name!!)
                })
    }
}
