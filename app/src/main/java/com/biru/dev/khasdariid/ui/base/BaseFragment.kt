package com.biru.dev.khasdariid.ui.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.view.View
import com.biru.dev.khasdariid.di.component.ActivityComponent
import com.biru.dev.khasdariid.utils.CommonUtils

/**
 * Created by miftahun on 3/30/18.
 */

abstract class BaseFragment : Fragment(), MvpView{

    var activity: BaseActivity? = null
    var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp(view)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            this.activity = context
            context.onFragmentAttached()
        }
    }

    override fun showLoading() {
        hideLoading()
        progressDialog = CommonUtils.showLoadingDialog(this.context!!)
    }

    override fun hideLoading() {
        if (progressDialog != null && progressDialog!!.isShowing) {
            progressDialog!!.cancel()
        }
    }

    override fun onError(message: String) {
        activity!!.onError(message)
    }

    override fun onError(@StringRes resId: Int) {
        activity!!.onError(resId)
    }

    override fun showMessage(message: String) {
        activity!!.showMessage(message)
    }

    override fun showMessage(@StringRes resId: Int) {
        activity!!.showMessage(resId)
    }

    override val isNetworkConnected: Boolean
        get() = activity!!.isNetworkConnected

    override fun onDetach() {
        activity = null
        super.onDetach()
    }

    override fun hideKeyboard() {
        if (activity != null) {
            activity!!.hideKeyboard()
        }
    }

    override fun openActivityOnTokenExpire() {
        if (activity != null) {
            activity!!.openActivityOnTokenExpire()
        }
    }

    fun getActivityComponent(): ActivityComponent? {
        return if (activity != null) {
            activity!!.activityComponent
        } else null
    }

    fun getBaseActivity(): BaseActivity? {
        return activity
    }

    protected abstract fun setUp(view: View?)


    interface Callback {

        fun onFragmentAttached()

        fun onFragmentDetached(tag: String)
    }
}