package com.biru.dev.khasdariid.ui.placedetail

import android.os.Bundle
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import javax.inject.Inject


class PlaceDetailActivity : BaseActivity(), PlaceDetailMvpView {

    @Inject
    lateinit var mPresenter: PlaceDetailMvpPresenter<PlaceDetailMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_detail)

        activityComponent.inject(this)

        mPresenter.onAttach(this@PlaceDetailActivity)

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
