package com.gentasoft.footballclub.apps

import android.app.Application
import android.content.Context

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {

        var context: Context? = null
            private set
    }
}
