package com.payment.wiproprojectfortraning.android

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.replace
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.payment.wiproprojectfortraning.android.viewModelRecyclerView.Product


/**
 *Replace an existing fragment that was added to a container. This is essentially the same as calling remove(Fragment) for all currently added fragments that were added with the same containerViewId and then add(int, Fragment, String) with the same arguments given here.
 * Params:
 * containerViewId – Identifier of the container whose fragment(s) are to be replaced.
 * fragmentClass – The new fragment to place in the container, created via the FragmentManager's FragmentFactory.
 * args – Optional arguments to be set on the fragment.
 * tag – Optional tag name for the fragment, to later retrieve the fragment with FragmentManager.findFragmentByTag(String).
 * Returns:
 * Returns the same FragmentTransaction instance.
 */

fun FragmentActivity.replaceFragment(
    container: Int, fragment: Fragment, addToBackStack: Boolean = true

) {
    val transaction = supportFragmentManager.beginTransaction().replace(container, fragment)
    if (addToBackStack) {
        transaction.addToBackStack(fragment::class.java.simpleName)

    }
    transaction.commit()
}

/** Add a fragment to the activity state. This fragment may optionally also have its view (if Fragment.onCreateView returns non-null) into a container view of the activity.
Params:
containerViewId – Optional identifier of the container this fragment is to be placed in. If 0, it will not be placed in a container.
fragmentClass – The fragment to be added, created via the FragmentManager's FragmentFactory.
args – Optional arguments to be set on the fragment.
tag – Optional tag name for the fragment, to later retrieve the fragment with FragmentManager.findFragmentByTag(String).
Returns:
Returns the same FragmentTransaction instance.
 * */

fun FragmentActivity.addFragment(
    container: Int, fragment: Fragment, addToBackStack: Boolean = true

) {
    val transaction = supportFragmentManager.beginTransaction().add(container, fragment)
    if (addToBackStack) {
        transaction.addToBackStack(fragment::class.java.simpleName)

    }
    transaction.commit()
}

///

fun Context.saveProductList(key: String, value: List<Product>) {
    val gson = Gson()
    val json = gson.toJson(value) // Convert the list to JSON string
    getSharedPreferences(applicationInfo.name, Context.MODE_PRIVATE)
        .edit()
        .putString(key, json)
        .apply()
}

fun Context.getProductList(key: String): List<Product>? {
    val gson = Gson()
    val response = getSharedPreferences(applicationInfo.name, Context.MODE_PRIVATE)
        .getString(key,null)
    return gson.fromJson(response, object : TypeToken<List<Product>>() {}.type)
}

fun Context.saveStringValue(key: String, value: String) {
    getSharedPreferences(applicationInfo.name, Context.MODE_PRIVATE)
        .edit()
        .putString(key, value)
        .apply()
}

fun Context.getStringValue(key: String):String? {
    return  getSharedPreferences(applicationInfo.name, Context.MODE_PRIVATE).getString(key,null)
}

fun Context.saveObject(key: String, obj: Any){
    val gson = Gson()
    val json = gson.toJson(obj)
    getSharedPreferences(applicationInfo.name, Context.MODE_PRIVATE)
        .edit()
        .putString(key, json)
        .apply()
}
inline fun <reified T> Context.getObject(key: String): T? {
    val gson = Gson()
    val response = getSharedPreferences(applicationInfo.name, Context.MODE_PRIVATE)
        .getString(key,null)
    return gson.fromJson(response, T::class.java)

}