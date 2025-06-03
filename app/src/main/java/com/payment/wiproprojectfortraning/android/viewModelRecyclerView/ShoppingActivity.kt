package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R

class ShoppingActivity : AppCompatActivity() {
    private val shoppingViewModel : ShoppingViewModel by viewModels()
    private val recyclerView : RecyclerView by lazy { findViewById(R.id.recyclerView) }
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



    fun initViewItem() {

        recyclerView.apply {
            adapter = ShoppingAdapter(shoppingViewModel.products.value) {}
        }
    }


}