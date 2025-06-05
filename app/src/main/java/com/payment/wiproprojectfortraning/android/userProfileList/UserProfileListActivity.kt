package com.payment.wiproprojectfortraning.android.userProfileList

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.payment.wiproprojectfortraning.R

/** UserProfileListActivity.kt
 * - Fragment - UserProfileListFragment
 * - Fragment - UserProfileDetailsFragment
 * - ViewModel - UserProfileViewModel
 * - Key Points assignment
 * - Show user List
 * - When you click on user list then go on details screen
 * - Show user details - UserProfileDetailsFragment.
 *
 * */



class UserProfileListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}