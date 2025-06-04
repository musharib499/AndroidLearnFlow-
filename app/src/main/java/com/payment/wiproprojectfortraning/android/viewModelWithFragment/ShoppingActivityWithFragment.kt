package com.payment.wiproprojectfortraning.android.viewModelWithFragment

import android.os.Bundle
import android.view.View
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
import com.payment.wiproprojectfortraning.android.getProductList
import com.payment.wiproprojectfortraning.android.replaceFragment
import com.payment.wiproprojectfortraning.android.saveProductList
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.ShoppingViewModel
const val KEY_PRODUCT_LIST = "KEY_PRODUCT_LIST"
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
        window.apply {
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            statusBarColor = getColor(R.color.purple_500)
        }
        // Getting product list from shared preference
        getProductList(KEY_PRODUCT_LIST)?.let {
            viewModel.setProductList(it)
        }
        initView()
    }
    fun initView(){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Shopping List"
        replaceFragment(R.id.fragmentContainer,ShoppingListFragment.newInstance(),false)

    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressedDispatcher.onBackPressed()
        return true
    }

    override fun onStop() {
        super.onStop()
        // Saving product list in shared preference
        saveProductList(KEY_PRODUCT_LIST, viewModel.products.value)
    }

}