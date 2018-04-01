package com.biru.dev.khasdariid.ui.placedetail

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.biru.dev.khasdariid.ui.detaildeskripsi.DetailDeskripsiFragment
import com.biru.dev.khasdariid.ui.detaillokasi.DetailLokasiFragment
import com.biru.dev.khasdariid.ui.detailoleholeh.DetailOlehOlehFragment
import com.biru.dev.khasdariid.ui.detailreview.DetailReviewFragment
import com.biru.dev.khasdariid.ui.detailrute.DetailRuteFragment
import java.util.ArrayList

/**
 * Created by miftahun on 3/30/18.
 */
class PlaceDetailPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var fragmentArrayList = ArrayList<Fragment>()
    private val tabTitles = arrayOf("1", "2", "3", "4", "5")


    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        fragmentArrayList.add(DetailDeskripsiFragment())
        fragmentArrayList.add(DetailLokasiFragment())
        fragmentArrayList.add(DetailRuteFragment())
        fragmentArrayList.add(DetailOlehOlehFragment())
        fragmentArrayList.add(DetailReviewFragment())
        return fragmentArrayList[position]
    }
}