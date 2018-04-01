package com.biru.dev.khasdariid.ui.detailoleholeh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class DetailOlehOlehFragment : BaseFragment(), DetailOlehOlehMvpView {

    @Inject
    lateinit var mPresenter: DetailOlehOlehMvpPresenter<DetailOlehOlehMvpView>

    fun newInstance(): DetailOlehOlehFragment {
        val args = Bundle()
        val fragment = DetailOlehOlehFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail_oleh_oleh, container, false)

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
