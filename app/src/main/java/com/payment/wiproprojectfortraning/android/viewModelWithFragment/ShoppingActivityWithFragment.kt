package com.payment.wiproprojectfortraning.android.viewModelWithFragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentContainerView
import androidx.lifecycle.ViewModelProvider
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.addFragment
import com.payment.wiproprojectfortraning.android.replaceFragment
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.ShoppingViewModel

class ShoppingActivityWithFragment : AppCompatActivity() {
    private val viewModel: ShoppingFragmentViewModel by lazy { ViewModelProvider(this)[ShoppingFragmentViewModel::class.java] }
    private val toolbar: Toolbar by lazy { findViewById(R.id.toolbar) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shopping_with_fragment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initView()
    }
    fun initView(){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        replaceFragment(R.id.fragmentContainer,ShoppingListFragment.newInstance(),false)

    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressedDispatcher.onBackPressed()
        return true
    }

}