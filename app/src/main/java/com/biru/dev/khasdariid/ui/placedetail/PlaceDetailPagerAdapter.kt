package com.biru.dev.khasdariid.ui.placedetail

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.ArrayList

/**
 * Created by miftahun on 3/30/18.
 */
class PlaceDetailPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var fragmentArrayList = ArrayList<Fragment>()
    private val tabTitles = arrayOf("1", "2", "3", "4", "5")

    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        fragmentArrayList.add(NumbersFragment())
        fragmentArrayList.add(FamilyFragment())
        fragmentArrayList.add(ColorsFragment())
        fragmentArrayList.add(PhraseFragment())
        return fragmentArrayList[position]
    }
}