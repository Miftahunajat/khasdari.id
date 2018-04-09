package com.biru.dev.khasdariid.ui.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject


class LoginActivity : BaseActivity(), LoginMvpView {

    @Inject
    lateinit var mPresenter: LoginMvpPresenter<LoginMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        activityComponent.inject(this)

        mPresenter.onAttach(this@LoginActivity)

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
