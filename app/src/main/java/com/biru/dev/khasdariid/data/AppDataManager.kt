package com.groot.indonesia.grootapp.data

import android.content.Context
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.groot.indonesia.grootapp.data.firebase.FirebaseDataManager

import com.groot.indonesia.grootapp.data.prefs.PreferenceHelper
import com.groot.indonesia.grootapp.di.ApplicationContext

import javax.inject.Inject

/**
 * Created by miftahun on 3/8/18.
 */

class AppDataManager @Inject
constructor(@ApplicationContext context: Context,
            val mPreferenceHelper: PreferenceHelper,
            val firebaseDataManager: FirebaseDataManager) : DataManager {



    override fun signUpUser(email: String, password: String, onCompleteListener: OnCompleteListener<AuthResult>) {
        firebaseDataManager.signUpUser(email, password, onCompleteListener)
    }

    override fun signInUser(email: String, password: String, onCompleteListener: OnCompleteListener<AuthResult>) {
        firebaseDataManager.signInUser(email, password, onCompleteListener)
    }

    override fun logout(stateListener: FirebaseAuth.AuthStateListener) {
        firebaseDataManager.logout(stateListener)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getStatusUser(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setStatusUser(nama: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}