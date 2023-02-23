package com.alchemist.angelsagao.hsauidhwisa

import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import android.view.View
import android.view.ViewGroup
import com.alchemist.angelsagao.fijc.MenuMainHubAct
import com.alchemist.angelsagao.R
import com.alchemist.angelsagao.fijc.TrueLibertyAwaits
import com.appsflyer.AppsFlyerLib
import org.koin.core.qualifier.named
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater

import com.my.tracker.MyTracker
import com.onesignal.OneSignal



class Yisjsjajixijzcokoskc : Fragment() {
    private lateinit var ijicjixkookvcij: Context
    val ppqpqoqokwow: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ijicjixkookvcij = context
    }


    private fun iokorokkoasdko(fjid: String) {
        OneSignal.setExternalUserId(
            fjid,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(cioxjivxcji: JSONObject) {

                    try {
                        if (cioxjivxcji.has("push") && cioxjivxcji.getJSONObject("push").has("success")) {
                            val dokskofokd = cioxjivxcji.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $dokskofokd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (cioxjivxcji.has("email") && cioxjivxcji.getJSONObject("email").has("success")) {
                            val wopkqokowkoqk =
                                cioxjivxcji.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $wopkqokowkoqk"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (cioxjivxcji.has("sms") && cioxjivxcji.getJSONObject("sms").has("success")) {
                            val ijjisdjijiijxzijcij = cioxjivxcji.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $ijjisdjijiijxzijcij"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.vcuasiudhwyg, container, false)
    }

    override fun onStart() {
        super.onStart()
        val hhvcuhfhud = "deviceID="
        val kcixuvhdhu = "sub_id_1="
        val ygcyxg = ppqpqoqokwow.getString("country", null)
        val soidwjidji = ppqpqoqokwow.getString("appCamp", null)

        val sijdji = ppqpqoqokwow.getString("deepSt", null)
        val qopqoqkokwokskoiajd = "ad_id="
        val hxbzbhcushujidjiasij = "sub_id_4="

        val apppbpvovbkobvon = "sub_id_5="
        val okoxokoxckvko = ppqpqoqokwow.getString("countryDev", null)
        val orokokeokowkokwo = ppqpqoqokwow.getString("apps", null)
        val wokksod = "deeporg"
        val bnbnjvjcuhvc = ppqpqoqokwow.getString("wv", null)
        val fodo = Intent(ijicjixkookvcij, TrueLibertyAwaits::class.java)
        val eokwokkosdko = ppqpqoqokwow.getString("mainId", null)
        val papapapaposksodk = "com.alchemist.angelsagao"
        val hdhdsuhsfieefij = Build.VERSION.RELEASE
        val rcxyuhvhuxuchvhu = MyTracker.getTrackerParams()
        val opeplwlpwplsplpd = "sub_id_6="
        val ogoffkkv = "naming"
        rcxyuhvhuxuchvhu.customUserId = eokwokkosdko
        val osokzokokzokozkkozxkoxkocjssjiduhud: String? = ppqpqoqokwow.getString("instId", null)


        val eoplwlpwplskodko = Intent(ijicjixkookvcij, MenuMainHubAct::class.java)


        val xuizhuxchuxc = AppsFlyerLib.getInstance().getAppsFlyerUID(ijicjixkookvcij)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        iokorokkoasdko(eokwokkosdko.toString())


        val okoqokoksjiad = "$bnbnjvjcuhvc$kcixuvhdhu$soidwjidji&$hhvcuhfhud$xuizhuxchuxc&$qopqoqkokwokskoiajd$eokwokkosdko&$hxbzbhcushujidjiasij$papapapaposksodk&$apppbpvovbkobvon$hdhdsuhsfieefij&$opeplwlpwplsplpd$ogoffkkv"
        val xuizhjcuzxh = "$bnbnjvjcuhvc$hhvcuhfhud$eokwokkosdko&$qopqoqkokwokskoiajd$osokzokokzokozkkozxkoxkocjssjiduhud&$hxbzbhcushujidjiasij$papapapaposksodk&$apppbpvovbkobvon$hdhdsuhsfieefij&$opeplwlpwplsplpd$ogoffkkv"
        val sdoksko = "$bnbnjvjcuhvc$kcixuvhdhu$sijdji&$hhvcuhfhud$xuizhuxchuxc&$qopqoqkokwokskoiajd$eokwokkosdko&$hxbzbhcushujidjiasij$papapapaposksodk&$apppbpvovbkobvon$hdhdsuhsfieefij&$opeplwlpwplsplpd$wokksod"
        val cijjijiddvisj = "$bnbnjvjcuhvc$kcixuvhdhu$sijdji&$hhvcuhfhud$eokwokkosdko&$qopqoqkokwokskoiajd$osokzokokzokozkkozxkoxkocjssjiduhud&$hxbzbhcushujidjiasij$papapapaposksodk&$apppbpvovbkobvon$hdhdsuhsfieefij&$opeplwlpwplsplpd$wokksod"

        Log.d("AdvertId", eokwokkosdko.toString())
        when(orokokeokowkokwo) {
            "1" ->
                if(soidwjidji != "null") {
                    ppqpqoqokwow.edit().putString("link", okoqokoksjiad).apply()
                    startActivity(fodo)
                    activity?.finish()
                } else if (sijdji!=null||okoxokoxckvko!!.contains(ygcyxg.toString())) {
                    ppqpqoqokwow.edit().putString("link", sdoksko).apply()
                    startActivity(fodo)
                    activity?.finish()
                } else {
                    startActivity(eoplwlpwplskodko)
                    activity?.finish()
                }
            "0" ->
                if(sijdji!=null) {
                    ppqpqoqokwow.edit().putString("link", cijjijiddvisj).apply()
                    startActivity(fodo)
                    activity?.finish()
                } else if (okoxokoxckvko!!.contains(ygcyxg.toString())) {
                    ppqpqoqokwow.edit().putString("link", xuizhjcuzxh).apply()
                    startActivity(fodo)
                    activity?.finish()
                } else {
                    startActivity(eoplwlpwplskodko)
                    activity?.finish()
                }
        }
    }


}