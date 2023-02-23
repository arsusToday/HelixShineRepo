package com.alchemist.angelsagao

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class AppClass: Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("527bd9a1-ce0d-4d1a-829b-0c3b9cc3ef85")
        MyTracker.initTracker("39123225874634910451", this)

        val trackerConfig = MyTracker.getTrackerConfig()
        trackerConfig.isTrackingLaunchEnabled = true
        val instID = MyTracker.getInstanceId(this)
        val shP = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        shP.edit().putString("instId", instID).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@AppClass)
            modules(
                listOf(
                    appModule, viewModelModule
                )
            )
        }
    }
}