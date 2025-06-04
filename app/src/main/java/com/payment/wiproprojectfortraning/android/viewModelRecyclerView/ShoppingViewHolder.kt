package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R

class ShoppingViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvName = view.findViewById<TextView>(R.id.tvName)
    val tvPrice = view.findViewById<TextView>(R.id.tvPrice)
    val btnAdd = view.findViewById<Button>(R.id.btnAdd)
    val imageId = view.findViewById<ImageView>(R.id.imageId)
    val tvDes = view.findViewById<TextView>(R.id.tvDes)
    val imgFav = view.findViewById<ImageView>(R.id.imgFav)

}