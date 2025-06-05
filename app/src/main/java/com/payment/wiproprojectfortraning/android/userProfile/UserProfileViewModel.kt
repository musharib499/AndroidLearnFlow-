package com.payment.wiproprojectfortraning.android.userProfile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserProfileViewModel : ViewModel() {
    private val _userProfileData = MutableLiveData<UserProfileData>()
    val userProfileData: LiveData<UserProfileData> = _userProfileData
    private val _saveData = MutableLiveData<UserProfileData>()
    val saveData: LiveData<UserProfileData> = _saveData


    fun getDataPrevious(userProfileData: UserProfileData) {
        _userProfileData.value = userProfileData

    }
    fun saveData(userProfileData: UserProfileData) {
        _userProfileData.value = userProfileData
        _saveData.value = userProfileData

    }
}