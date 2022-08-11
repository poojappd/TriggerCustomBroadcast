package com.example.triggercustombroadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {
    private lateinit var Localbm : LocalBroadcastManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Localbm = LocalBroadcastManager.getInstance(applicationContext)
        val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)

       registerReceiver(MyReceiver(), intentFilter,)






    }


    fun triggerExternalbr(view: View){
        val intent = Intent("com.example.broadcast.MY_NOTIFICATION")
       // intent.setPackage("secret.apps.only")

           sendBroadcast(intent, "com.example.secret")

    }
}