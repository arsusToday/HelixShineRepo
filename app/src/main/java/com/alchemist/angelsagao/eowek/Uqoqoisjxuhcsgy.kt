package com.alchemist.angelsagao.eowek

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alchemist.angelsagao.Doskskodjixjichu
import com.alchemist.angelsagao.Xozkkozxjisdhushu
import com.alchemist.angelsagao.Eqoqkwjisdhushd
import com.alchemist.angelsagao.Yisjisjiadhuhuasd
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Uqoqoisjxuhcsgy(private val ijsdijadsjijijxzc: Xozkkozxjisdhushu, private val xzjiczxij: Eqoqkwjisdhushd, private val suydgw: SharedPreferences, val xjizcjizcjixij: Application): ViewModel() {


    private val hhchcbvbhxcvjnc = MutableLiveData<String?>()
    val epllpqplqpls: LiveData<String?>
        get() = hhchcbvbhxcvjnc

    fun ocxkokokzxokjicijizjx() {
        val fooeowoowow = AdvertisingIdClient(xjizcjizcjixij)
        fooeowoowow.start()
        val nnnxxmcjxjcsuhu = fooeowoowow.info.id.toString()
        hhchcbvbhxcvjnc.postValue(nnnxxmcjxjcsuhu)
    }
    init {
        viewModelScope.launch (Dispatchers.IO){
            ocxkokokzxokjicijizjx()
        }
        viewModelScope.launch (Dispatchers.Main){
            vicjijiijijxcij()
        }
    }

    suspend fun vicjijiijijxcij() {
        fokrokeokew.postValue(ijsdijadsjijijxzc.sjdjis().body())
        sokwdokoksakod()
    }
    private val fokrokeokew = MutableLiveData<Doskskodjixjichu>()
    val sokkozkoxo: LiveData<Doskskodjixjichu>
        get() = fokrokeokew
    suspend fun sokwdokoksakod() {
        try {
            osijdjisji.postValue(xzjiczxij.mxmkckijhuduhf().body())
        } catch (e:java.lang.Exception) {
            Log.d("EFFF", e.toString())
        }
    }


    private val jjcnvjcbvhfbg = MutableLiveData<String>()
    val osososodisj: LiveData<String>
        get() = jjcnvjcbvhfbg
    fun bbcnncxkkvk(cont: Context) {
        AppsFlyerLib.getInstance()
            .init("kVfYLazrP6hD2mH2PaR3AT", ooksooskokxiixxixixix, xjizcjizcjixij)
        AppsFlyerLib.getInstance().start(cont)
    }
    private val rokeokoksakod = MutableLiveData<String>()
    val sokakodijs: LiveData<String>
        get() = rokeokoksakod
    fun eokkowkokodokdoksajijxcijzc(odkso: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            odkso
        ) { jxcnjnxcjn: AppLinkData? ->
            jxcnjnxcjn?.let {
                val dokkodfko = jxcnjnxcjn.targetUri?.host.toString()
                suydgw.edit().putString("deepSt", dokkodfko).apply()
            }
        }
    }

    private val ooksooskokxiixxixixix  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(cioifjjifd: MutableMap<String, Any>?) {
            val sodkkowkoowdk = cioifjjifd?.get("campaign").toString()
            rokeokoksakod.postValue(sodkkowkoowdk)
        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }
        override fun onAttributionFailure(error: String?) {
        }
    }


    private val osijdjisji = MutableLiveData<Yisjisjiadhuhuasd>()
    val xucuxhz: LiveData<Yisjisjiadhuhuasd>
        get() = osijdjisji

}