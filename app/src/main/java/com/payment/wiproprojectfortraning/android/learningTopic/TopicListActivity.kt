package com.payment.wiproprojectfortraning.android.learningTopic

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.MainActivity

class TopicListActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null

    private val topicList = listOf(
        TopicData(1, "Activity Lifecycle and How to Move to Next Screen", "Activity Lifecycle"),
        TopicData(
            2,
            "Recycler View or List dynamic item",
            "- Activity/Fragment Lifecycle, Adapter- ViewHolder - Layout- LayoutManager"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_topic_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initView()

    }

    fun  initView() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
            adapter = TopicAdapter(topicList, {onItemClicked(it)})
           // layoutManager = LinearLayoutManager(this@TopicListActivity)
        }
    }

    fun onItemClicked(topicData: TopicData) {
        when (topicData.topicId) {
            1-> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            else -> {
                Toast.makeText(this, topicData.topicName, Toast.LENGTH_SHORT).show()
            }
        }
    }
}