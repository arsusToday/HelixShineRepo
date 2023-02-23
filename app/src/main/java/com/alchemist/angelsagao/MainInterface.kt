package com.alchemist.angelsagao

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

interface MainInterface {
    @GET("moderpidor.php?directmenow=toHui&")
    suspend fun getDataDev(): Response<GeoDev>
}
interface ApiInterface {
    @GET("json/?key=ZSSz86ONagSoYRv")
    suspend fun getData(): Response<CountryCodeJS>
}

class DevRepo(private val devData: MainInterface) {
    suspend fun getDataDev() = devData.getDataDev()
}


class CountryRepo(private val countryApi: ApiInterface) {
    suspend fun getDat() = countryApi.getData()
}


data class GeoDev(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "NeHodiSudaGoogle")
    val GeoShmeo: String,
    @field:Json(name = "GoogleSukaView")
    val GoogleSukaView: String,
    @field:Json(name = "ACGoogleSosat")
    val appsCh: String
)

@Keep
data class CountryCodeJS(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val cou: String,
)