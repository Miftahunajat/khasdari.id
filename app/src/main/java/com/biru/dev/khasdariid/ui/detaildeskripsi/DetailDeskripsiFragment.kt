package com.biru.dev.khasdariid.ui.detaildeskripsi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class DetailDeskripsiFragment : BaseFragment(), DetailDeskripsiMvpView {

    @Inject
    lateinit var mPresenter: DetailDeskripsiMvpPresenter<DetailDeskripsiMvpView>

    fun newInstance(): DetailDeskripsiFragment {
        val args = Bundle()
        val fragment = DetailDeskripsiFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail_deskripsi, container, false)

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
