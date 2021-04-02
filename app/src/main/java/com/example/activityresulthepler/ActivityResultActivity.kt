package com.example.activityresulthepler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

open class ActivityResultActivity : AppCompatActivity() {

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        javaClass.methods
            .filter { it.isAnnotationPresent(OnActivityResult.WithResultCode::class.java) }
            .filter {
                val annotation = it.getAnnotation(OnActivityResult.WithResultCode::class.java)
                annotation.resultCode == resultCode
            }.forEach {
                it.invoke(this)
            }

        javaClass.methods
            .filter { it.isAnnotationPresent(OnActivityResult.WithRequestCode::class.java) }
            .filter {
                val annotation = it.getAnnotation(OnActivityResult.WithRequestCode::class.java)
                annotation.requestCode == requestCode
            }.forEach {
                it.invoke(this)
            }

        javaClass.methods
            .filter { it.isAnnotationPresent(OnActivityResult.WithCodes::class.java) }
            .filter {
                val annotation = it.getAnnotation(OnActivityResult.WithCodes::class.java)
                annotation.requestCode == requestCode && annotation.resultCode == resultCode
            }.forEach {
                it.invoke(this)
            }
    }
}