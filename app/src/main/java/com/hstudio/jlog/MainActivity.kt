package com.hstudio.jlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        JLog.i("HJ", "Hello World!")
        JLog.i("Hello World!")
        JLog.i("HJ")
        JLog.i(tag = "HJ", message = "Hello World")
        JLog.printStackTrace()
        JLog.printStackTrace("Hi")
    }
}
