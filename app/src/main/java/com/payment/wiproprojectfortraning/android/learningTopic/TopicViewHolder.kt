package com.payment.wiproprojectfortraning.android.learningTopic

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R

class TopicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle: TextView = view.findViewById(R.id.tvTitle)
    val tvDes: TextView = view.findViewById(R.id.tvDes)
    val cardId: View = view.findViewById(R.id.cardId)

}