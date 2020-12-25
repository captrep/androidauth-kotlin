package dev.captrep.capt.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News (
    val judul: String = "",
    val link: String ="",
    val waktu: String ="",
    val tipe: String ="",
    val poster: String ="",
    val kutipan: String =""
) : Parcelable