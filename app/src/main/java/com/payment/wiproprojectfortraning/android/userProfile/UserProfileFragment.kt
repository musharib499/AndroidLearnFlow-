package com.payment.wiproprojectfortraning.android.userProfile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textfield.TextInputEditText
import com.payment.wiproprojectfortraning.R
import com.payment.wiproprojectfortraning.android.getObject
import com.payment.wiproprojectfortraning.android.loadImage
import com.payment.wiproprojectfortraning.android.saveObject


/**
 * A simple [Fragment] subclass.
 * Use the [UserProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserProfileFragment : Fragment() {

    // ViewModel which connected with fragment write logic inside of viewmodel
   private val viewModel: UserProfileViewModel by viewModels()
    // this get view by id and set data inside of view or using lazy
   private val etName:TextInputEditText by lazy { requireView().findViewById(R.id.etName) }
   private val etEmail:TextInputEditText by lazy { requireView().findViewById(R.id.etEmail) }
   private val etPhone:TextInputEditText by lazy { requireView().findViewById(R.id.etPhone) }
   private val imProfile: ShapeableImageView by lazy { requireView().findViewById(R.id.imProfile) }
   private val imEdit: ShapeableImageView by lazy { requireView().findViewById(R.id.imEdit) }
   private val saveBtn: Button by lazy { requireView().findViewById(R.id.btnSave) }
    companion object {
        const val KEY_USER_PROFILE = "KEY_USER_PROFILE" // this is key for save data and get data
        // This is factory method for create instance of fragment
        fun newInstance() = UserProfileFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // init data
        initData()
    }

    fun initData(){
        viewModel.userProfileData.observe(viewLifecycleOwner) {
            etName.setText(it.name)
            etEmail.setText(it.email)
            etPhone.setText(it.phone)
            imProfile.loadImage(it.userImage)
        }
        // set data when click on button
        saveBtn.setOnClickListener {
          if (getValidatename()){
              viewModel.saveData(UserProfileData(etName.text.toString(),etEmail.text.toString(),etPhone.text.toString()))
          } else {
              Toast.makeText(activity, "Please enter valid data", Toast.LENGTH_SHORT).show()
          }

        }
        viewModel.saveData.observe(viewLifecycleOwner){
            this.context?.saveObject(KEY_USER_PROFILE,it).apply {
                Toast.makeText(activity, "User Profile data saved", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun getValidatename():Boolean{
        val nameRegex = Regex("^[a-zA-Z ]+$")
        val phoneRegex = Regex("^\\d{10}$")
        val emailRegex = Regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
       return when {
            etName.text.isNullOrEmpty() -> {
                etName.error = "Name is required"
                return false
            }
            !nameRegex.matches(etName.text.toString()) -> {
                etName.error = "Enter valid name "
                return false
            }
            etEmail.text.isNullOrEmpty() -> {
                etEmail.error = "Email is required"
                return false
            }
            !emailRegex.matches(etEmail.text.toString()) -> {
                etEmail.error = "Enter valid email "
                return false
            }
            etPhone.text.isNullOrEmpty() -> {
                etPhone.error = "Phone is required"
                return false
            }
            !phoneRegex.matches(etPhone.text.toString()) -> {
                etPhone.error = "Enter valid phone "
                return false
            }
           else -> return true

        }
    }

    override fun onResume() {
        super.onResume()
        this.context?.getObject<UserProfileData>(KEY_USER_PROFILE)?.apply {
            viewModel.getDataPrevious(this)
        }
    }


}