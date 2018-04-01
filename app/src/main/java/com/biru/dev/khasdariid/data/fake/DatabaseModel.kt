package com.biru.dev.khasdariid.data.fake

import com.biru.dev.khasdariid.data.fake.model.OlehOleh
import com.biru.dev.khasdariid.data.fake.model.Wisata
import io.reactivex.Observable
import java.util.*

/**
 * Created by miftahun on 4/1/18.
 */
interface DatabaseModel {

    fun getListWisata(): Observable<List<Wisata>>

    fun getWisata(id: Int): Observable<Wisata>?

    fun getWisata(name: String): Observable<List<Wisata>>

    fun getListOlehOleh(): Observable<List<OlehOleh>>

    fun getOlehOleh(id: Int): OlehOleh?

    fun getOlehOleh(name: String): List<OlehOleh>

}