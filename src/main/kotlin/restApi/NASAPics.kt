package restApi

import dto.Planetary
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NASAPics {
    @GET("/planetary/apod")
    fun planetaryAPOD(@Query("api_key") apiKey: String = "DEMO_KEY"): Call<Planetary>
}
