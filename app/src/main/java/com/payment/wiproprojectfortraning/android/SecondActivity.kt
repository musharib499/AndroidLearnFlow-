package com.payment.wiproprojectfortraning.android

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.payment.wiproprojectfortraning.R



/** What is lateinit ?
 *  - lateinit is used to initialize variable later.
 *  - lateinit is used to initialize variable before using it.
 *  - Use case of lateinit - initialize variable before using it. and avoid null pointer exception.
 * -  lateinit it not inilize in memory till it is used.
 * */
/* lazy initialization - What is lazy initialization?
*  - Lazy is property delegate in kotlin that allow lazy initialization of variable.
*  - When will you use this then it will initialize in memory.
*  - Based on single tone
*  - lazy mark as val - not var  - use keyword as lazy
* - name by lazy { }
* */



class SecondActivity : AppCompatActivity() {
    // onCreate - called when the activity is first created. initialize views and variables etc
    val TAG = "SecondActivity"
    var btn:Button? = null

    var textView:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // How can access xml file ?
        setContentView(R.layout.activity_second)
        btn = findViewById<Button>(R.id.btnBack)
        textView = findViewById<TextView>(R.id.textView)
        Log.d(TAG, "onCreate: ")
    }
    // onStart - called when the activity is becomes visible to the user.
    override fun onStart() {
        super.onStart()
        initView()
        Log.d(TAG, "onStart: ")
    }

    private fun initView() {
        val textValue:String? = intent.getStringExtra("key")
        textValue?.let {
            textView?.text = it
        }
        btn?.setOnClickListener {
            Toast.makeText(this, "Click on Button", Toast.LENGTH_SHORT).show()
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