package com.biru.dev.khasdariid.ui.base

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import com.biru.dev.khasdariid.App
import com.biru.dev.khasdariid.R


import com.biru.dev.khasdariid.di.component.ActivityComponent
import com.biru.dev.khasdariid.di.component.DaggerActivityComponent
import com.biru.dev.khasdariid.ui.login.LoginActivity
import com.groot.indonesia.grootapp.di.module.ActivityModule
import com.biru.dev.khasdariid.utils.CommonUtils
import com.biru.dev.khasdariid.utils.NetworkUtils



/**
 * Created by miftahun on 3/8/18.
 */

abstract class BaseActivity : AppCompatActivity(), MvpView,BaseFragment.Callback {

    private var mProgressDialog: ProgressDialog? = null
    lateinit var activityComponent: ActivityComponent

    override val isNetworkConnected: Boolean
        get() {return NetworkUtils.isNetworkConnected(getApplicationContext());}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as App).appComponent)
                .build()
    }

    override fun showLoading() {
        hideLoading()
        mProgressDialog = CommonUtils.showLoadingDialog(this)
    }

    override fun hideLoading() {
        if (mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog!!.cancel()
        }
    }

    private fun showSnackBar(message: String) {
        val snackbar = Snackbar.make(findViewById(android.R.id.content),
                message, Snackbar.LENGTH_SHORT)
        val sbView = snackbar.view
        val textView = sbView
                .findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
        textView.setTextColor(ContextCompat.getColor(this, R.color.white))
        snackbar.show()
    }

    override fun onError(message: String) {
        showSnackBar(message)
    }

    override fun onError(@StringRes resId: Int) {
        onError(getString(resId))
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(@StringRes resId: Int) {
        showMessage(getString(resId))
    }

    override fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun openActivityOnTokenExpire() {
        startActivity(Intent(this,LoginActivity::class.java))
        finish()
    }


    protected abstract fun setUp()

    override fun onFragmentAttached() {

    }

    override fun onFragmentDetached(tag: String) {

    }
}
