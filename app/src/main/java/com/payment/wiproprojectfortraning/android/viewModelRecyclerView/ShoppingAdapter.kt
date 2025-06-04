package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.loadImage

class ShoppingAdapter(
    private val context: Context,
    private var list: List<Product>?,
    private val onItemFavorite: (Product?) -> Unit ,
    private val onItemAdd: (Product?) -> Unit,
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
                tvPrice.text = context.resources.getString(R.string.amount,"${item.price}")
                imageId.loadImage(item.imageUrl ?: "")
                tvDes.text = item.productDescription
                btnAdd.text = if (item.isAdded) "Remove to Card" else "Add to Card"
                imgFav.setOnClickListener { onItemFavorite(item) }
                imgFav.setImageResource(if (item.isFavorite) R.drawable.ic_favorite else R.drawable.ic_no_favorite)
                btnAdd.setOnClickListener { onItemAdd(item) }
            }
        }
    }
}