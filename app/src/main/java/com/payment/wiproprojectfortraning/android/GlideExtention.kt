package com.payment.wiproprojectfortraning.android

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.payment.wiproprojectfortraning.R

fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
        .load(url)
        .placeholder(R.drawable.placeholder_image) // optional placeholder image it when your image not till loaded it show
        .error(R.drawable.error_image) // optional error image it when image not loaded
        .centerCrop()
        .circleCrop()
        .into(this)
}