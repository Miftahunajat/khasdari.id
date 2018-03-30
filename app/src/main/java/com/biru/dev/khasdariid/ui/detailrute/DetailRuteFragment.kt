package com.biru.dev.khasdariid.ui.detailrute

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import com.biru.dev.khasdariid.ui.home.HomeMvpPresenter
import com.biru.dev.khasdariid.ui.home.HomeMvpView
import javax.inject.Inject


class DetailRuteFragment : BaseFragment(), DetailRuteMvpView {

    @Inject
    lateinit var mPresenter: DetailRuteMvpPresenter<DetailRuteMvpView>

    fun newInstance(): DetailRuteFragment {
        val args = Bundle()
        val fragment = DetailRuteFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail_rute, container, false)

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
