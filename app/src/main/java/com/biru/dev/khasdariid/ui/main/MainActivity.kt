package com.biru.dev.khasdariid.ui.main

import android.os.Bundle
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import javax.inject.Inject


class MainActivity : BaseActivity(), MainMvpView {

    @Inject
    lateinit var mPresenter: MainMvpPresenter<MainMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout....)

        activityComponent.inject(this)

        mPresenter.onAttach(this@MainActivity)

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }
}
