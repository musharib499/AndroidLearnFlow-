package com.payment.wiproprojectfortraning.android.userProfile

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.replaceFragment

/** Create user profile folder
 * Create - UserProfileActivity.kt
 * Create - UserProfileFragment.kt
 * Create - UserProfileViewModel.kt
 * Create - activity_user_profile.xml
 * Create - fragment_user_profile.xml
 * Create - UserProfileData.kt
 * Key points for this Assignment
 *  Save Button - data will save inside of Shared Preference
 *  Close App - Previous data show in user profile
* */

class UserProfileActivity : AppCompatActivity() {
    private val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // set toolbar
        setToolbar()

        // Fragment is added to the activity
        replaceFragment(R.id.fragmentContainer, UserProfileFragment.newInstance(), false)
    }


   private fun setToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "User Profile"
       window.apply {
           decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
           statusBarColor = getColor(R.color.purple_500)
       }

    }
    override fun onSupportNavigateUp(): Boolean {

        onBackPressedDispatcher.onBackPressed()
        return true
    }


}