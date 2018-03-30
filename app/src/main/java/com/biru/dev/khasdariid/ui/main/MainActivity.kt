package com.biru.dev.khasdariid.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.Toolbar
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.R.id.navigation_bookmark
import com.biru.dev.khasdariid.R.id.navigation_oleh_oleh
import com.biru.dev.khasdariid.R.layout.toolbar
import com.biru.dev.khasdariid.ui.base.BaseActivity
import com.biru.dev.khasdariid.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject


class MainActivity : BaseActivity(), MainMvpView {

    override val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_bookmark -> {
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_oleh_oleh-> {
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_wisata-> {
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_user-> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    @Inject
    lateinit var mPresenter: MainMvpPresenter<MainMvpView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent.inject(this)

        mPresenter.onAttach(this@MainActivity)

        setUp()

        setOnClickListeners()
    }


    override fun setOnClickListeners() {

    }

    override fun setUp() {
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        BottomNavigationViewHelper.removeShiftMode(navigation)
        navigation.selectedItemId = R.id.home

        val toolbar: Toolbar = main_toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun loadHomeFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadBookmarkFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadOlehOlehFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadWisataFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadUserFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
