package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.loadImage

class ShoppingDetailsActivity : AppCompatActivity() {
    private val TAG = ShoppingDetailsActivity::class.java.simpleName
    private val recyclerView : RecyclerView by lazy { findViewById(R.id.recyclerView) }
    private val btnGoToCard : Button by lazy { findViewById(R.id.btnGoToCard) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shopping_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initView()
    }


   private fun  initView() {
        val product = intent.getParcelableArrayListExtra<Product>("product")?.toList()
        recyclerView.apply {
            adapter = ShoppingAdapter(product,{})
        }
        btnGoToCard.setOnClickListener {
            finish()
        }


    }

}