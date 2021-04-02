package com.example.activityresulthepler

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_seconady)

        findViewById<View>(R.id.ok).setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }

        findViewById<View>(R.id.result100).setOnClickListener {
            setResult(100)
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}