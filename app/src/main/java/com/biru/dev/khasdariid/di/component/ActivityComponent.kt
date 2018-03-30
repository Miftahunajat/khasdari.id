package com.biru.dev.khasdariid.di.component

import com.biru.dev.khasdariid.di.PerActivity
import com.biru.dev.khasdariid.ui.home.HomeFragment
import com.biru.dev.khasdariid.ui.login.LoginActivity
import com.biru.dev.khasdariid.ui.main.MainActivity
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

}
