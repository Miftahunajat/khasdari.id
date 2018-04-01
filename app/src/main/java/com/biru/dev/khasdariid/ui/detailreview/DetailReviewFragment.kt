package com.biru.dev.khasdariid.ui.detailreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class DetailReviewFragment : BaseFragment(), DetailReviewMvpView {

    @Inject
    lateinit var mPresenter: DetailReviewMvpPresenter<DetailReviewMvpView>

    fun newInstance(): DetailReviewFragment {
        val args = Bundle()
        val fragment = DetailReviewFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail_review, container, false)

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
