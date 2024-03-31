package com.example.wotakuy

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MemberJKT48(
    val fullName: String,
    val nickName: String,
    val statusMember: String,
    val genMember: String,
    val kabesha: Int,
    val birthday: String,
    val bloodtype: String,
    val horoscope: String,
    val jiko: String,
    val show: Int,
    val debut: String,
    val promotion: String,
    val gennum: Int,
    val nickNameN: String,
    val fanbase: String,
    val instagram: String,
    val twitter: String,
    val tiktok: String,
    val showroom: String,
    val idnlive: String,
    val xFB: String

) : Parcelable