package com.biru.dev.khasdariid.ui.register

import android.os.Bundle
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import javax.inject.Inject


class RegisterActivity : BaseActivity(), RegisterMvpView {

    @Inject
    lateinit var mPresenter: RegisterMvpPresenter<RegisterMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        activityComponent.inject(this)

        mPresenter.onAttach(this@RegisterActivity)

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
