package com.payment.wiproprojectfortraning.android.userProfile

data class UserProfileData(
    val name: String,
    val email: String,
    val phone: String,
    val userImage: String = "https://randomuser.me/api/portraits/men/1.jpg"
)
