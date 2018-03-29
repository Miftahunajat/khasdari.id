package com.biru.dev.khasdariid

import android.app.Application
import com.biru.dev.khasdariid.di.component.ApplicationComponent
import com.biru.dev.khasdariid.di.component.DaggerApplicationComponent
import com.biru.dev.khasdariid.di.module.ApplicationModule

/**
 * Created by miftahun on 3/29/18.
 */

class App:Application(){

    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()

        appComponent.inject(this)
    }
}