package com.alchemist.angelsagao

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.alchemist.angelsagao.eowek.Uqoqoisjxuhcsgy
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val xijzcijsijidhuhud = module {
    single<Fiwjwijwijshuadgyxzc>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(Fiwjwijwijshuadgyxzc::class.java)
    }

    single <Skxmzcisaihushu> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Skxmzcisaihushu::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://elitebastille.life/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        Eqoqkwjisdhushd(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        Xozkkozxjisdhushu(get(named("ApiInter")))
    }

    single {
        vcvxhuivjjidjihuf()
    }
    single(named("SharedPreferences")) {
        nxncjjxsij(androidApplication())
    }

}
fun nxncjjxsij(orkeokekooskd: Application): SharedPreferences {
    return orkeokekooskd.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun vcvxhuivjjidjihuf(): Moshi {
    return Moshi.Builder().build()
}

val siisjijsikosdkokos = module {
    viewModel(named("MainModel")) {
        Uqoqoisjxuhcsgy(
            get(named("CountryRep")),
            get(named("DevRep")),
            get(named("SharedPreferences")),
            get()
        )
    }
}