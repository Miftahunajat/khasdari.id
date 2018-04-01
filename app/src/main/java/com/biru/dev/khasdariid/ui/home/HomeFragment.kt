package com.biru.dev.khasdariid.ui.home

import android.animation.Animator
import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout.HORIZONTAL
import android.widget.LinearLayout.VERTICAL
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.data.fake.model.OlehOleh
import com.biru.dev.khasdariid.data.fake.model.Wisata
import com.biru.dev.khasdariid.ui.base.BaseActivity
import com.biru.dev.khasdariid.ui.base.BaseFragment
import com.biru.dev.khasdariid.ui.placedetail.PlaceDetailActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_populer.view.*
import javax.inject.Inject


class HomeFragment : BaseFragment(), HomeMvpView{

    @Inject
    lateinit var mPresenter: HomeMvpPresenter<HomeMvpView>

    @Inject
    lateinit var wisataPopularAdapter: WisataPopularAdapter

    @Inject
    lateinit var olehOlehPopularAdapter: OlehOlehAdapter


    companion object {
        fun newInstance(): HomeFragment {
            val args = Bundle()
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }

      val TAG = "HomeFragment"
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

    override fun onResume() {
        super.onResume()
        setupFragment()
    }

    override fun setOnClickListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setUp(view: View?) {
        rv_tempat_terpopuler.layoutManager = LinearLayoutManager(context, HORIZONTAL,false)
        rv_tempat_terpopuler.itemAnimator = DefaultItemAnimator()
        rv_tempat_terpopuler.adapter = wisataPopularAdapter

        rv_oleh_oleh_terpopuler.layoutManager = LinearLayoutManager(context, HORIZONTAL,false)
        rv_oleh_oleh_terpopuler.itemAnimator = DefaultItemAnimator()
        rv_oleh_oleh_terpopuler.adapter = olehOlehPopularAdapter
    }

    override fun displayPlacePopularList(places: List<Wisata>?) = places?.let {
        wisataPopularAdapter.addWisatassToList(it)
    }

    override fun displayOlehOlehList(olehs: List<OlehOleh>) = olehs.let {
        olehOlehPopularAdapter.addOlehOlehsToList(it)
    }

    override fun setupFragment() {
        mPresenter.onLoadWisataPopular()
        mPresenter.onLoadOlehOlehPopuler()
    }
}
