package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.loadImage

class ShoppingAdapter(
    private var list: List<Product>?, private val onItemAdd: (Product?) -> Unit
) : RecyclerView.Adapter<ShoppingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_shopping, parent, false)
        return ShoppingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }
    fun updateList(newList: List<Product>?) {
        list = newList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        list?.get(position)?.let { item ->
            holder.apply {
                tvName.text = item.name
                tvPrice.text = item.price.toString()
                imageId.loadImage(item.imageUrl ?: "")
                tvDes.text = item.productDescription
                btnAdd.text = if (item.isAdded) "Remove to Card" else "Add to Card"
                btnAdd.setOnClickListener { onItemAdd(item) }
            }
        }
    }
}