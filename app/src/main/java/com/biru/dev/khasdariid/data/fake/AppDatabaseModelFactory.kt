package com.biru.dev.khasdariid.data.fake

import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.R.drawable.dummy_borobudur
import com.biru.dev.khasdariid.data.fake.model.OlehOleh
import com.biru.dev.khasdariid.data.fake.model.Wisata
import io.reactivex.Observable
import java.util.*
import javax.inject.Inject

/**
 * Created by miftahun on 4/1/18.
 */
class AppDatabaseModelFactory @Inject constructor() : DatabaseModel {

    var listWisata = ArrayList<Wisata>()
    var listOlehOleh = ArrayList<OlehOleh>()

    init {
        val wisata1 = Wisata(1,"Candi Borobudur Yogyakarta", "Yogyakarta", listOf(R.drawable.dummy_borobudur,R.drawable.dummy_borobudur),5f)
        val wisata2 = wisata1.copy(id = 2)
        val wisata3 = wisata1.copy(id = 3)
        val wisata4 = wisata1.copy(id = 4)
        val wisata5 = wisata1.copy(id = 5)
        listWisata.addAll(listOf(wisata1, wisata2, wisata3, wisata4, wisata5))

        val olehOleh:OlehOleh = OlehOleh(2,"Pie Jakarta","Jakarta",1, listOf(R.drawable.dummy_borobudur),4.5f)
        listOlehOleh.addAll(listOf(olehOleh,olehOleh.copy(id = 2),olehOleh.copy(id = 3)))

    }

    override fun getListWisata(): Observable<List<Wisata>> {
        return Observable.fromArray(listWisata)
    }



    override fun getWisata(id: Int): Observable<Wisata>? {
        return Observable.fromArray(listWisata.find {
            it.id.equals(id)
        })
    }

    override fun getWisata(name: String): Observable<List<Wisata>> {
        return Observable.fromArray(listWisata.filter {
            it.name?.contains(name)!!
        })
    }

    override fun getListOlehOleh(): Observable<List<OlehOleh>> {
        return  Observable.fromArray(listOlehOleh)
    }

    override fun getOlehOleh(id: Int): OlehOleh? {
        return listOlehOleh.find {
            it.id.equals(id)
        }
    }

    override fun getOlehOleh(name: String): List<OlehOleh> {
        return listOlehOleh.filter {
            it.name?.contains(name)!!
        }
    }
}