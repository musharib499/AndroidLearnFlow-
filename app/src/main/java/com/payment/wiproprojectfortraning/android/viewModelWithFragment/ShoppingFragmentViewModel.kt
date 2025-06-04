package com.payment.wiproprojectfortraning.android.viewModelWithFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.Product
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.productList

// Writing here use case... // domain part
class ShoppingFragmentViewModel : ViewModel() {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products
    private val _totalAmount = MutableLiveData<Double>()
    val totalAmount: LiveData<Double> = _totalAmount
    private val _totalItem = MutableLiveData<Int>()
    val totalItem: LiveData<Int> = _totalItem


    init {
        _products.value = productList
        updateTotal()
    }
    fun setProductList(list: List<Product>?) {
        list?.let {
            _products.value = it
        }?:run {
            _products.value = productList
        }

        updateTotal()

    }

    fun addItem(product: Product) {
        val currentList = _products.value?.toMutableList() ?: return
        val index = currentList.indexOfFirst { it.id == product.id }
        if (index != -1) {
            val upatedProduct = currentList[index].copy(isAdded = true)
            currentList[index] = upatedProduct
            _products.value = currentList
        }
        updateTotal()
    }

    fun removeItem(product: Product) {
        val currentList = _products.value?.toMutableList() ?: return
        val index = currentList.indexOfFirst { it.id == product.id }
        if (index != -1) {
            val upatedProduct = currentList[index].copy(isAdded = false)
            currentList[index] = upatedProduct
            _products.value = currentList
        }
        updateTotal()
    }

    private fun updateTotal() {
        val currentList = _products.value ?: return
        val totalAmount = currentList.sumOf { it.price * if (it.isAdded) 1 else 0 }
        val totalItem = currentList.count { it.isAdded }
        _totalAmount.value = totalAmount
        _totalItem.value = totalItem

    }

    fun markAsFavorite(product: Product?) {
        _products.value =
            _products.value?.map { if (it.id == product?.id) it.copy(isFavorite = !it.isFavorite) else it }
    }

}