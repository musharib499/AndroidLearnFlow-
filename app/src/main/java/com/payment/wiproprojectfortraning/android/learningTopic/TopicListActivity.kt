package com.payment.wiproprojectfortraning.android.learningTopic

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.semantics.SemanticsProperties.Selected
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.activityLifecycle.MainActivity
import com.payment.wiproprojectfortraning.android.getStringValue
import com.payment.wiproprojectfortraning.android.saveStringValue
import com.payment.wiproprojectfortraning.android.userProfile.UserProfileActivity
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.ShoppingActivity
import com.payment.wiproprojectfortraning.android.viewModelWithFragment.ShoppingActivityWithFragment

const val KEY_ITEM_SEECTED = "KEY_ITEM_SEECTED"
class TopicListActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private val textTopic:TextView by lazy { findViewById(R.id.tvTopicNameList) }

    private val topicList = listOf(
        TopicData(1, "Activity Lifecycle and How to Move to Next Screen", "Activity Lifecycle"),
        TopicData(
            2,
            "Recycler View or List dynamic item",
            "- Activity/Fragment Lifecycle, Adapter- ViewHolder - Layout- LayoutManager"
        ),

        TopicData(
            3,
            "Shopping List with Fragment and ViewModel",
            "Fragment Lifecycle, Adapter- ViewHolder - Layout- LayoutManager"
        )
        ,

        TopicData(
            4,
            "User Profile",
            "Using - Activity-fragment-viewmodel-sharedpreference-dataclass"
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

    override fun onResume() {
        super.onResume()
        textTopic.text =  "Previous Selectde item => ${getStringValue(KEY_ITEM_SEECTED)?: "Not Selected any Item"}"
    }

    fun onItemClicked(topicData: TopicData) {
        saveStringValue(KEY_ITEM_SEECTED, topicData.topicName)
        when (topicData.topicId) {
            1-> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            2 -> {
                startActivity(Intent(this, ShoppingActivity::class.java))
            }
            3 -> {
                startActivity(Intent(this, ShoppingActivityWithFragment::class.java))
            }
            4 -> {
                startActivity(Intent(this, UserProfileActivity::class.java))
            }
            else -> {
                // startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}