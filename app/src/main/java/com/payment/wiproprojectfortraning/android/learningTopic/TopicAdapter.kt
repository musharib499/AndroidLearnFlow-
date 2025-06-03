package com.payment.wiproprojectfortraning.android.learningTopic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R

/** RecyclerView - Adapter
 * - Adapter - Provide data to the RecyclerView
 * - ViewHolder - Holds Reference to views for performance
 * - OnCreateViewHolder - Called when RecyclerView needs a new ViewHolder of the given type to represent an item.
 * - Inflates the xml layout and create the view holder
 * - getItemCount - Returns the total number of items in the data set held by the adapter.
 * - OnBindViewHolder - Called by RecyclerView to display the data at the specified position.
 * */

class TopicAdapter(
    private val topicList: List<TopicData>,
    private val onItemClicked: (TopicData) -> Unit
) : RecyclerView.Adapter<TopicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
        return TopicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return topicList.size
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        topicList[position].apply {
            holder.tvTitle.text = topicName
            holder.tvDes.text = topicDescription
            holder.cardId.setOnClickListener {
                onItemClicked(this)
            }
        }
    }
}