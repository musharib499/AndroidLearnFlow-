package com.payment.wiproprojectfortraning.android

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.replace


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
    container: Int,
    fragment:Fragment,
    addToBackStack:Boolean = true

){
    val transaction = supportFragmentManager.beginTransaction()
        .replace(container,fragment)
      if(addToBackStack){
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
    container: Int,
    fragment:Fragment,
    addToBackStack:Boolean = true

){
    val transaction = supportFragmentManager.beginTransaction()
        .add(container,fragment)
    if(addToBackStack){
        transaction.addToBackStack(fragment::class.java.simpleName)

    }
    transaction.commit()
}