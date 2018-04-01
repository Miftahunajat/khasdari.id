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
import kotlinx.android.synthetic.main.activity_splash.*
import android.R.attr.y
import android.R.attr.x
import android.content.res.Resources
import android.graphics.Point
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.util.Log
import android.util.TypedValue
import android.view.Display
import android.widget.LinearLayout






class SplashActivity : BaseActivity(), SplashMvpView {

    var screenWitdth: Int = 0


    @Inject
    lateinit var mPresenter: SplashMvpPresenter<SplashMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        activityComponent.inject(this)

        mPresenter.onAttach(this@SplashActivity)

        setOnClickListeners()

        setUp()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        screenWitdth = getWidthSize()
    }

    override fun openLoginActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    override fun updateProgress(int: Int) {
        val lp = ConstraintLayout.LayoutParams((int.toFloat() / 100f * screenWitdth.toFloat()).toInt(),
                (6f * this.resources.displayMetrics.density).toInt())
        lp.bottomToBottom = R.id.container// or set height to any fixed value you want
        view_loading.setLayoutParams(lp)
    }

    fun getWidthSize(): Int{
        val display = windowManager.defaultDisplay
        val size = Point()
        try {
            display.getRealSize(size)
        } catch (err: NoSuchMethodError) {
            display.getSize(size)
        }

        return size.x
    }
}
