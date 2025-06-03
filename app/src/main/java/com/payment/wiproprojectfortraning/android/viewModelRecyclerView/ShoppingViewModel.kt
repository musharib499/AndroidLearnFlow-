package com.payment.wiproprojectfortraning.android.viewModelRecyclerView

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide.init

/* ViewModel?  - What is ViewModel?
* - ViewModel is a components of Android Architecture Components
* - ViewModel is a design to store and manage UI-related data in a lifecycle conscious way
* - ViewModel survives configuration changes such as screen rotation
* - ViewModel is lifecycle aware
* - ViewModel - keep instance as keep in cache till if activity/fragment not finish
* - if Activity/ Fragment recreating - return same instance of viewModel
* */


/*
*  Whats is Live data - https://developer.android.com/topic/libraries/architecture/livedata
*  - LiveData - hold Data
*  - LiveData - observe Data
*  - LiveData - lifecycle aware
*  - LiveData - setData - set data from forground
*  - LiveData - postData - set data from background
*  - LiveData Benefit
* - - No memory leaks
* - - No crashes due to configuration changes or stop activity
* - - No more manual life cycle handling
* - - Always up to date data
* - MutableLiveData - we can change or modify
* - LiveData - we can only read
*
* */
class ShoppingViewModel : ViewModel() {
    //
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


    fun getAddedItems(): ArrayList<Product>? {
        return (_products.value?.filter { it.isAdded } ?: emptyList()).toCollection(ArrayList())
    }


}