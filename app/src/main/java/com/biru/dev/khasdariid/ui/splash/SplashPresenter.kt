package com.biru.dev.khasdariid.ui.splash

import android.content.Intent
import android.os.AsyncTask
import android.support.v4.content.ContextCompat.startActivity
import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.data.prefs.PreferenceHelper
import com.biru.dev.khasdariid.ui.base.BasePresenter
import com.biru.dev.khasdariid.ui.login.LoginActivity
import com.biru.dev.khasdariid.ui.main.MainActivity
import io.reactivex.disposables.CompositeDisposable
import java.util.logging.Handler
import javax.inject.Inject


/**
 * Created by miftahun on 3/8/18.
 */

class SplashPresenter<V : SplashMvpView> @Inject
constructor(dataManager: DataManager, compositeDisposable: CompositeDisposable) : BasePresenter<V>(dataManager,compositeDisposable), SplashMvpPresenter<V> {

    override fun onAttach(view: V) {
        super.onAttach(view)

        LoadTask().execute()
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

    inner class LoadTask : AsyncTask<Unit, Int, Unit>(){

        override fun doInBackground(vararg p0: Unit?) {
            for (i in 1..100){
                publishProgress(i)
                Thread.sleep(1)
            }
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            getView()?.updateProgress(values.get(0)!!)
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)
            getView()?.openLoginActivity()
        }
    }
}
