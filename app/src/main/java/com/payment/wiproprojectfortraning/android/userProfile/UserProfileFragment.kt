package com.payment.wiproprojectfortraning.android.userProfile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
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

   private val viewModel: UserProfileViewModel by viewModels()
   private val etName:TextInputEditText by lazy { requireView().findViewById(R.id.etName) }
   private val etEmail:TextInputEditText by lazy { requireView().findViewById(R.id.etEmail) }
   private val etPhone:TextInputEditText by lazy { requireView().findViewById(R.id.etPhone) }
   private val imProfile: ShapeableImageView by lazy { requireView().findViewById(R.id.imProfile) }
   private val imEdit: ShapeableImageView by lazy { requireView().findViewById(R.id.imEdit) }
   private val saveBtn: Button by lazy { requireView().findViewById(R.id.btnSave) }
    companion object {
        const val KEY_USER_PROFILE = "KEY_USER_PROFILE"
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
            viewModel.saveData(UserProfileData(etName.text.toString(),etEmail.text.toString(),etPhone.text.toString()))
        }
        viewModel.saveData.observe(viewLifecycleOwner){
            this.context?.saveObject(KEY_USER_PROFILE,it)
        }

    }

    override fun onResume() {
        super.onResume()
        this.context?.getObject<UserProfileData>(KEY_USER_PROFILE)?.apply {
            viewModel.getDataPrevious(this)
        }
    }


}