package com.biru.dev.khasdariid.data

import android.content.Context

import com.biru.dev.khasdariid.data.prefs.PreferenceHelper
import com.biru.dev.khasdariid.di.ApplicationContext

import javax.inject.Inject

/**
 * Created by miftahun on 3/8/18.
 */

class AppDataManager @Inject
constructor(@ApplicationContext context: Context,
            val mPreferenceHelper: PreferenceHelper) : DataManager {



    override fun getStatusUser(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setStatusUser(nama: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}