package com.curiousapps.lacknertutorials.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneModeChangeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnabled){
            Toast.makeText(context, "Airplane Enabled", Toast.LENGTH_LONG).show()
            Log.e("Airplane: ", "ON" )
        }else Toast.makeText(context, "Airplane Disabled", Toast.LENGTH_LONG).show()
    }
}