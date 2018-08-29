package com.gentasoft.footballclub.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Club(
        val id: Int,
        val name: String,
        val imgRsc: Int,
        val desc: String
) : Parcelable