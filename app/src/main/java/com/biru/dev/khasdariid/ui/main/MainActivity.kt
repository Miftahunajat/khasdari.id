package com.biru.dev.khasdariid.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.TabLayout
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.R.id.*
import com.biru.dev.khasdariid.R.layout.toolbar
import com.biru.dev.khasdariid.ui.base.BaseActivity
import com.biru.dev.khasdariid.ui.home.HomeFragment
import com.biru.dev.khasdariid.ui.oleholeh.OlehOlehFragment
import com.biru.dev.khasdariid.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject


class MainActivity : BaseActivity(), MainMvpView {

    override val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                mPresenter.onHomeClicked()
                currentFragmentTag = HomeFragment.TAG
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_bookmark -> {
                mPresenter.onBookmarkClicked()
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_oleh_oleh-> {
                mPresenter.onOlehOlehClicked()
                currentFragmentTag = OlehOlehFragment.TAG
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_wisata-> {
                mPresenter.onWisataClicked()
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_user-> {
                mPresenter.onUserInfoClicked()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    @Inject
    lateinit var mPresenter: MainMvpPresenter<MainMvpView>

    var currentFragmentTag = HomeFragment.TAG

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
        supportFragmentManager
                .beginTransaction()
                .disallowAddToBackStack()
                .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                .replace(R.id.framelayout_main, HomeFragment.newInstance())
                .commit()
    }

    override fun loadBookmarkFragment() {
        supportFragmentManager
                .beginTransaction()
                .disallowAddToBackStack()
                .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                .replace(R.id.framelayout_main, OlehOlehFragment.newInstance())
                .commit()
    }

    override fun loadOlehOlehFragment() {
        supportFragmentManager
                .beginTransaction()
                .disallowAddToBackStack()
                .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                .replace(R.id.framelayout_main, OlehOlehFragment.newInstance())
                .commit()
    }

    override fun loadWisataFragment() {
        supportFragmentManager
                .beginTransaction()
                .disallowAddToBackStack()
                .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                .replace(R.id.framelayout_main, OlehOlehFragment.newInstance())
                .commit()
    }

    override fun loadUserFragment() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentDetached(tag: String) {
        val fragmentManager = supportFragmentManager
        val fragment = fragmentManager.findFragmentByTag(tag)
        if (fragment != null) {
            fragmentManager
                    .beginTransaction()
                    .disallowAddToBackStack()
                    .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                    .remove(fragment)
                    .commitNow()
        }
    }

    companion object {
        fun getIntent(context:Context): Intent {
            return Intent(context,MainActivity::class.java)
        }
    }
}
