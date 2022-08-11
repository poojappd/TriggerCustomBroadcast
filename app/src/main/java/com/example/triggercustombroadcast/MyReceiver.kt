package com.example.triggercustombroadcast

import android.content.BroadcastReceiver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Triggercustombroadcast receiver\n UID - ${android.os.Process.myUid()}", Toast.LENGTH_SHORT).show()
        Log.e(ContentValues.TAG,"Receivedf")
    }
}