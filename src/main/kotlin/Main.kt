import restApi.NASAPics
import util.RetrofitServiceGenerator

fun main() {
    val nasaPics = RetrofitServiceGenerator.createService(NASAPics::class.java)

    val response = nasaPics.planetaryAPOD().execute()

    if (!response.isSuccessful) {
        println("HTTP Status Code: ${response.code()}")
        println(response.errorBody()?.string())
        return
    }

    val planetary = response.body()
    if (planetary != null) {
        println(planetary)
    }
}
