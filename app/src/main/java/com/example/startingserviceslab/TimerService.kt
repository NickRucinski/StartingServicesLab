package com.example.startingserviceslab

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TimerService : Service(){
    override fun onBind(p0: Intent?): IBinder? {
        TODO()
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent != null){
            runTimer(intent.getIntExtra("StartNumber", 10))
        }
        return super.onStartCommand(intent, flags, startId)
    }

    fun runTimer(startNum: Int){
        CoroutineScope(Dispatchers.Default).launch {
            repeat(startNum){
                (startNum-it).toString().run{
                    Log.d("Countdown", this)
                }
                delay(1000)
            }
        }
        stopSelf()
    }

    override fun onDestroy() {
        super.onDestroy()
    }



}