package com.app.toastmessage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.messagetoaster.ToasterClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val action = ToasterClass()
        action.displayToast("aditya", this)
    }
}