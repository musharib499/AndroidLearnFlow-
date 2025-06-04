package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R

class ShoppingActivity : AppCompatActivity() {
    private val shoppingViewModel: ShoppingViewModel by viewModels()
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.recyclerView) }
    private val btnGoToCard: Button by lazy { findViewById(R.id.btnGoToCard) }
    private val adapter: ShoppingAdapter by lazy {
        ShoppingAdapter(this,emptyList(), {}) {
            it?.let { item ->
                if (item.isAdded) {
                    shoppingViewModel.removeItem(item)
                }else {
                    shoppingViewModel.addItem(item)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shopping)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initViewItem()
    }


    private fun initViewItem() {

        recyclerView.adapter = adapter

        shoppingViewModel.products.observe(this) { updatedList ->
            adapter.updateList(updatedList)
        }

        btnGoToCard.setOnClickListener {
            val intent = Intent(this, ShoppingDetailsActivity::class.java).apply {
                putParcelableArrayListExtra("product", shoppingViewModel.getAddedItems())
            }
            startActivity(intent)
        }

    }


}