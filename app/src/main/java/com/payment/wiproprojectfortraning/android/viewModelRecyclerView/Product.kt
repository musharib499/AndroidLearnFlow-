package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val imageUrl: String,
    val discountPrice: Double,
    val productDescription: String,
    var isAdded: Boolean = false,
    var isFavorite: Boolean = false
) : Parcelable

