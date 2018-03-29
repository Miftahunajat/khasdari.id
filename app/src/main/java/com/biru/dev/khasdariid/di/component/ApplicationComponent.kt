package com.biru.dev.khasdariid.di.component

import android.app.Application
import android.content.Context
import com.biru.dev.khasdariid.App
import com.biru.dev.khasdariid.di.ApplicationContext
import com.biru.dev.khasdariid.di.module.ApplicationModule
import com.biru.dev.khasdariid.data.DataManager


import javax.inject.Singleton

import dagger.Component

/**
 * Created by miftahun on 3/9/18.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    val dataManager: DataManager

    fun inject(app: App)

    @ApplicationContext
    fun context(): Context

    fun application(): Application
}
