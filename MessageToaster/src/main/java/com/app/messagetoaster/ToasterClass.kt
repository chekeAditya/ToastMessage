package com.app.messagetoaster

import android.content.Context
import android.widget.Toast

class ToasterClass {

    fun displayToast(message: String, context: Context) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}