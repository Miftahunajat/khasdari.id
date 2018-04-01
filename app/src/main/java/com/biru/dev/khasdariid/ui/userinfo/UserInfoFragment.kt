package com.biru.dev.khasdariid.ui.userinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class UserInfoFragment : BaseFragment(), UserInfoMvpView {

    @Inject
    lateinit var mPresenter: UserInfoMvpPresenter<UserInfoMvpView>

    companion object {
        fun newInstance(): UserInfoFragment {
            val args = Bundle()
            val fragment = UserInfoFragment()
            fragment.arguments = args
            return fragment
        }

        val TAG = "UserInfoFragment"
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main_userinfo, container, false)

        val component = getActivityComponent()
        if (component != null) {
            component.inject(this)
            mPresenter.onAttach(this)
        }

        return view
    }


    override fun setOnClickListeners() {

    }

    override fun setUp(view: View?) {

    }
}
