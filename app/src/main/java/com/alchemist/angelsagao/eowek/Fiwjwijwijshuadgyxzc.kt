package com.alchemist.angelsagao

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class Doskskodjixjichu(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val cou: String,
)
interface Fiwjwijwijshuadgyxzc {
    @GET("moderpidor.php?directmenow=toHui&")
    suspend fun ixjcjizxhu(): Response<Yisjisjiadhuhuasd>
}
interface Skxmzcisaihushu {
    @GET("json/?key=ZSSz86ONagSoYRv")
    suspend fun nxncijuhdhuf(): Response<Doskskodjixjichu>
}




class Xozkkozxjisdhushu(private val jisdijs: Skxmzcisaihushu) {
    suspend fun sjdjis() = jisdijs.nxncijuhdhuf()
}


data class Yisjisjiadhuhuasd(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "helix_sh_giiisaudh")
    val helix_sh_giiisaudh: String,
    @field:Json(name = "helix_sh_vysatfdwt")
    val helix_sh_vysatfdwt: String,
    @field:Json(name = "helix_sh_adosdkfdij")
    val helix_sh_adosdkfdij: String
)

class Eqoqkwjisdhushd(private val hsuajidjis: Fiwjwijwijshuadgyxzc) {
    suspend fun mxmkckijhuduhf() = hsuajidjis.ixjcjizxhu()
}