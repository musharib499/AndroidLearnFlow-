package com.payment.wiproprojectfortraning.android.viewModelWithFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.Product
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.productList

class ShoppingFragmentViewModel:ViewModel() {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products


    init {
        _products.value = productList
    }

    fun addItem(product: Product) {
        val currentList = _products.value?.toMutableList() ?: return
        val index = currentList.indexOfFirst { it.id == product.id }
        if (index != -1) {
            val upatedProduct = currentList[index].copy(isAdded = true)
            currentList[index] = upatedProduct
            _products.value = currentList
        }
    }
    fun removeItem(product: Product) {
        val currentList = _products.value?.toMutableList() ?: return
        val index = currentList.indexOfFirst { it.id == product.id }
        if (index != -1) {
            val upatedProduct = currentList[index].copy(isAdded = false)
            currentList[index] = upatedProduct
            _products.value = currentList
        }
    }

}