package com.biru.dev.khasdariid.ui.detaillokasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.ui.base.BaseFragment
import javax.inject.Inject


class DetailLokasiFragment : BaseFragment(), DetailLokasiMvpView {

    @Inject
    lateinit var mPresenter: DetailLokasiMvpPresenter<DetailLokasiMvpView>

    fun newInstance(): DetailLokasiFragment {
        val args = Bundle()
        val fragment = DetailLokasiFragment()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail_lokasi, container, false)

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
