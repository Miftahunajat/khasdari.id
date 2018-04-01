package com.biru.dev.khasdariid.ui.home

import com.biru.dev.khasdariid.data.fake.model.OlehOleh
import com.biru.dev.khasdariid.data.fake.model.Wisata
import com.biru.dev.khasdariid.ui.base.MvpView


/**
 * Created by miftahun on 3/8/18.
 */

interface HomeMvpView : MvpView {

    fun displayPlacePopularList(places: List<Wisata>?): Unit?

    fun displayOlehOlehList(olehs: List<OlehOleh>): Unit?

    fun setupFragment()
}
