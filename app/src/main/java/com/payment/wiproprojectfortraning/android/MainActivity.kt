package com.payment.wiproprojectfortraning.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.payment.wiproprojectfortraning.R

/** Activity - What is activity? -- https://developer.android.com/reference/android/app/Activity
 * -  Activity is a single screen in an application- Where user can interact for something or do some action.
 *  - Activity Life cycle - onCreate, onStart, onResume,onRestart, onPause, onStop, onDestroy
 *  - onCreate - called when the activity is first created. initialize views and variables etc
 *  - onStart - called when the activity is becomes visible to the user.
 *  - onResume - called when the activity is visible and user can interact with it.
 *  - onPause - called when the activity is no longer visible to the user.
 *  - onStop - called when the activity is no longer visible to the user and release heavy resources release.
 *  - onDestroy - called when the activity is destroyed. for cleanup work here.
 *  - onRestart - called when the activity is restarted.
 *
 * */

/* - onCreate  - called when the activity is first created. initialize views and variables etc
* -
* -
* */

/* Intent - What is intent? -- https://developer.android.com/reference/android/content/Intent
* - Intent is used to start an activity.
* - Intent is used to passing data between activities.
* - Type Intent
* - Explicit Intent - start activity by class name or Directly specifies the target component.
*  -  It use to launch an activity/service/ broadcast receiver.
* - Implicit Intent - start activity by action or filter. or Does not specify the target component.
*  - Relies on the android system to resolve the best component to handle on the intent' action and data.
*  -- Example - enable system permission setting, any third party app that can handle the intent.
*
* */

/** Context in Android - https://developer.android.com/reference/android/content/Context
 *  - What is context?
 *  - Context is an object that represents the current environment in which an application is running.
 * - How may type of context in Android?
 *  - Application Context (getApplicationContext())- This is the context of the entire application. We can call as global context.
 *  -  Use case of Application context - Access system service globally or access resources globally,
 *  - Activity Context (getActivityContext()) - This is the context of the current activity. We can call as local context.
 *  - Use case of Activity context - Access resources of the current activity.
 *  - Service Context - This is the context of the current service. We can call as local context.
 *  - Inflate layout or show dialog
 *  - Start activity from another activity
 *
 * */

/*  findViewById - what is findViewById?
* - Finds a view that was identified by the id attribute from the XML that was processed in onCreate.
* - Returns:The view if found or null otherwise.
* -
* */


class MainActivity : AppCompatActivity() {
    // onCreate - called when the activity is first created. initialize views and variables etc
    val TAG = "MainActivity"
    var goNextBtn: Button? = null
    var showBtn: Button? = null
    var textView: TextView? = null
    var etView: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // How can access xml file ?
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
    }

    // onStart - called when the activity is becomes visible to the user.
    override fun onStart() {
        super.onStart()
        initViewId().apply {
            initListener()
        }
        Log.d(TAG, "onStart: ")
    }

    private fun initViewId() {
        showBtn = findViewById<Button>(R.id.btnShow)
        goNextBtn = findViewById<Button>(R.id.btnNext)
        textView = findViewById<TextView>(R.id.textId)
        etView = findViewById<EditText>(R.id.etView)

    }

    private fun initListener() {
        showBtn?.setOnClickListener {
            textView?.text = etView?.text
        }
        goNextBtn?.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", etView?.text.toString())
            startActivity(intent)
        }


    }

    // onResume - called when the activity is visible and user can interact with it.
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")

    }

    // OnRestart - called when the activity is restarted.
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")

    }

    // onPause - called when the activity is no longer visible to the user.
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    // onStop - called when the activity is no longer visible to the user and release heavy resources release.
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    // onDestroy - called when the activity is destroyed. for cleanup work here.
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }


}