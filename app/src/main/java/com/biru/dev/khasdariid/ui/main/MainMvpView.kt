package com.biru.dev.khasdariid.ui.main

import android.support.design.widget.BottomNavigationView
import com.biru.dev.khasdariid.ui.base.MvpView


/**
 * Created by miftahun on 3/8/18.
 */

interface MainMvpView : MvpView {

    val mOnNavigationItemSelectedListener: BottomNavigationView.OnNavigationItemSelectedListener

    fun loadHomeFragment()

    fun loadBookmarkFragment()

    fun loadOlehOlehFragment()

    fun loadWisataFragment()

    fun loadUserFragment()
}
