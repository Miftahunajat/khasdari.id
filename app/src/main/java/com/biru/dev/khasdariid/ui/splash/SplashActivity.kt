package com.biru.dev.khasdariid.ui.splash

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import javax.inject.Inject
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.Window
import android.view.WindowManager
import com.biru.dev.khasdariid.ui.main.MainActivity


class SplashActivity : BaseActivity(), SplashMvpView {

    @Inject
    lateinit var mPresenter: SplashMvpPresenter<SplashMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        activityComponent.inject(this)

        mPresenter.onAttach(this@SplashActivity)

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openLoginActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
