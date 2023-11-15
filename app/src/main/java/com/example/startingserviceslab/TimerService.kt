package com.example.startingserviceslab

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class TimerService : Service(){
    override fun onBind(p0: Intent?): IBinder? {

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {


        return super.onStartCommand(intent, flags, startId)
    }

    fun runTimer(startNum: Int){

    }



}