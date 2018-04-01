package com.biru.dev.khasdariid.ui.oleholeh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class OlehOlehFragment : BaseFragment(), OlehOlehMvpView {

    @Inject
    lateinit var mPresenter: OlehOlehMvpPresenter<OlehOlehMvpView>

    companion object {
        fun newInstance(): OlehOlehFragment {
            val args = Bundle()
            val fragment = OlehOlehFragment()
            fragment.arguments = args
            return fragment
        }

        val TAG: String = "OlehOlehFragment"
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main_oleh_oleh, container, false)

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
