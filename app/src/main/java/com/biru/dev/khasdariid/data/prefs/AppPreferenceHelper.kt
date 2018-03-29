package com.groot.indonesia.grootapp.data.prefs

import android.content.Context
import android.content.SharedPreferences


import com.groot.indonesia.grootapp.di.ApplicationContext
import com.groot.indonesia.grootapp.di.PreferenceInfo

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by miftahun on 3/8/18.
 */

@Singleton
class AppPreferenceHelper @Inject
constructor(@ApplicationContext context: Context,
            @PreferenceInfo prefFileName: String) : PreferenceHelper {

    val mPrefs: SharedPreferences

    init {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)
    }

    override fun getStatusUser(): String {
        return mPrefs.getString(PREF_KEY_USER_STATUS, null)
    }

    override fun setStatusUser(nama: String) {
        mPrefs.edit().putString(PREF_KEY_USER_STATUS, nama).apply()
    }

    companion object {

        private val PREF_KEY_USER_STATUS = "user-status"
    }
}
