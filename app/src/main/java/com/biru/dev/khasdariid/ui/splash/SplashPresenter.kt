package com.biru.dev.khasdariid.ui.splash

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.data.prefs.PreferenceHelper
import com.biru.dev.khasdariid.ui.base.BasePresenter
import com.biru.dev.khasdariid.ui.login.LoginActivity
import com.biru.dev.khasdariid.ui.main.MainActivity
import java.util.logging.Handler
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class SplashPresenter<V : SplashMvpView> @Inject
constructor(dataManager: DataManager) : BasePresenter<V>(dataManager), SplashMvpPresenter<V> {


    override fun onAttach(view: V) {
        super.onAttach(view)

        loadData()
    }

    override fun loadData() {

        val splashInterval = 3000

        android.os.Handler().postDelayed({
            getView()?.openLoginActivity()
        }, splashInterval.toLong())

    }

    companion object {

        private val TAG = "SplashPresenter"
    }

}
