package com.biru.dev.khasdariid.data.fake.model

/**
 * Created by miftahun on 3/31/18.
 */

data class Wisata(
        var id: Int = -1,
        var name: String? = null,
        var kota: String? = null,
        var photo: List<Int>? = null,
        var rating: Float = 0f
)