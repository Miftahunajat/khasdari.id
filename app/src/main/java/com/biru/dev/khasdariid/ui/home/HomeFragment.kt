package com.biru.dev.khasdariid.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseActivity
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class HomeFragment : BaseFragment(), HomeMvpView {

    @Inject
    lateinit var mPresenter: HomeMvpPresenter<HomeMvpView>

    fun newInstance(): HomeFragment {
        val args = Bundle()
        val fragment = HomeFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                     savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
