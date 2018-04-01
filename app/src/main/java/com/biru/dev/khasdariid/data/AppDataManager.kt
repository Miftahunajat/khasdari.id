package com.biru.dev.khasdariid.data

import android.content.Context
import com.biru.dev.khasdariid.data.fake.DatabaseModel
import com.biru.dev.khasdariid.data.fake.model.OlehOleh
import com.biru.dev.khasdariid.data.fake.model.Wisata

import com.biru.dev.khasdariid.data.prefs.PreferenceHelper
import com.biru.dev.khasdariid.di.ApplicationContext
import io.reactivex.Observable

import javax.inject.Inject

/**
 * Created by miftahun on 3/8/18.
 */

class AppDataManager @Inject
constructor(@ApplicationContext context: Context,
            val mPreferenceHelper: PreferenceHelper,
            val databaseModel: DatabaseModel) : DataManager {



    override fun getStatusUser(): String {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setStatusUser(nama: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getListWisata(): Observable<List<Wisata>> {
        return databaseModel.getListWisata()
    }

    override fun getWisata(id: Int): Observable<Wisata>? {
        return databaseModel.getWisata(id)
    }

    override fun getWisata(name: String): Observable<List<Wisata>> {
        return databaseModel.getWisata(name)
    }

    override fun getListOlehOleh(): Observable<List<OlehOleh>> {
        return databaseModel.getListOlehOleh()
    }

    override fun getOlehOleh(id: Int): OlehOleh? {
        return databaseModel.getOlehOleh(id)
    }

    override fun getOlehOleh(name: String): List<OlehOleh> {
        return databaseModel.getOlehOleh(name)
    }
}