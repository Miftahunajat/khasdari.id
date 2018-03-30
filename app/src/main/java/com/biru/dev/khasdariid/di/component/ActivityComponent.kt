package com.biru.dev.khasdariid.di.component

import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.detaildeskripsi.DetailDeskripsiFragment
import com.biru.dev.khasdariid.ui.detaillokasi.DetailLokasiFragment
import com.biru.dev.khasdariid.ui.detailoleholeh.DetailOlehOlehFragment
import com.biru.dev.khasdariid.ui.detailreview.DetailReviewFragment
import com.biru.dev.khasdariid.ui.detailrute.DetailRuteFragment
import com.biru.dev.khasdariid.ui.home.HomeFragment
import com.biru.dev.khasdariid.ui.login.LoginActivity
import com.biru.dev.khasdariid.ui.main.MainActivity
import com.biru.dev.khasdariid.ui.placedetail.PlaceDetailActivity
import com.biru.dev.khasdariid.ui.register.RegisterActivity
import com.biru.dev.khasdariid.ui.splash.SplashActivity
import com.groot.indonesia.grootapp.di.module.ActivityModule

import dagger.Component

/**
 * Created by miftahun on 3/9/18.
 */

@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
//
    fun inject(activity: LoginActivity)
//
    fun inject(activity: RegisterActivity)

    fun inject(splashActivity: SplashActivity)

    fun inject(mainActivity: MainActivity)

    fun inject(homeFragment: HomeFragment)

    fun inject(placeDetailActivity: PlaceDetailActivity)

    fun inject(detailRuteFragment: DetailRuteFragment)

    fun inject(detailDeskripsiFragment: DetailDeskripsiFragment)

    fun inject(detailLokasiFragment: DetailLokasiFragment)

    fun inject(detailOlehOlehFragment: DetailOlehOlehFragment)

    fun inject(detailReviewFragment: DetailReviewFragment)

}
