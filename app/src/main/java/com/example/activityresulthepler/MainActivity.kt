package com.example.activityresulthepler

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : ActivityResultActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.request_code_111).setOnClickListener {
            startActivityForResult(Intent(this, SecondActivity::class.java), 111)
        }

        findViewById<View>(R.id.request_code_222).setOnClickListener {
            startActivityForResult(Intent(this, SecondActivity::class.java), 222)
        }
    }

    @OnActivityResult.WithResultCode(resultCode = RESULT_OK)
    fun resultCodeOk() {
        Log.i("test2", "requestCodeOk")
    }

    @OnActivityResult.WithResultCode(resultCode = 100)
    fun resultCode100() {
        Log.i("test2", "requestCode100")
    }

    @OnActivityResult.WithRequestCode(requestCode = 111)
    fun requestCode111() {
        Log.i("test2", "requestCode111")
    }

    @OnActivityResult.WithRequestCode(requestCode = 222)
    fun requestCode222() {
        Log.i("test2", "requestCode222")
    }
}