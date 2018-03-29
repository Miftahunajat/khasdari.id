package com.biru.dev.khasdariid.di.module

import android.app.Application
import android.content.Context
import com.biru.dev.khasdariid.di.ApplicationContext
import com.biru.dev.khasdariid.data.AppDataManager
import com.biru.dev.khasdariid.data.DataManager
import com.biru.dev.khasdariid.data.prefs.AppPreferenceHelper
import com.biru.dev.khasdariid.data.prefs.PreferenceHelper

import com.biru.dev.khasdariid.di.PreferenceInfo
import com.biru.dev.khasdariid.utils.AppConstant



import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by miftahun on 3/9/18.
 */

@Module
class ApplicationModule(val mApplication: Application) {

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return this.mApplication
    }

    @Provides
    internal fun provideApplication(): Application {
        return this.mApplication
    }


    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun providePreferencesHelper(appPreferencesHelper: AppPreferenceHelper): PreferenceHelper {
        return appPreferencesHelper
    }

    @Provides
    @PreferenceInfo
    internal fun providePreferenceName(): String {
        return AppConstant.PREF_NAME
    }

}
