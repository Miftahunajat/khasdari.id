package com.biru.dev.khasdariid.data.prefs

import android.content.Context
import android.content.SharedPreferences
import com.biru.dev.khasdariid.di.ApplicationContext
import com.biru.dev.khasdariid.di.PreferenceInfo
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Created by miftahun on 3/8/18.
 */

@Singleton
class AppPreferenceHelper @Inject
constructor(@ApplicationContext context: Context,
            @PreferenceInfo prefFileName: String) : PreferenceHelper {

    val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

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
