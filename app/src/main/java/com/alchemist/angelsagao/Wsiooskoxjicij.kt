package com.alchemist.angelsagao

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class Wsiooskoxjicij: Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("527bd9a1-ce0d-4d1a-829b-0c3b9cc3ef85")
        MyTracker.initTracker("39123225874634910451", this)

        val sidjjisadhusdhu = MyTracker.getTrackerConfig()
        sidjjisadhusdhu.isTrackingLaunchEnabled = true
        val xzbchzxchbhb = MyTracker.getInstanceId(this)
        val sidjdisj = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        sidjdisj.edit().putString("instId", xzbchzxchbhb).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Wsiooskoxjicij)
            modules(
                listOf(
                    xijzcijsijidhuhud, siisjijsikosdkokos
                )
            )
        }
    }
}