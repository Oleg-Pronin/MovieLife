package oleg_pronin.movielife.domain.manager

import oleg_pronin.movielife.BuildConfig
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.util.stream.Collectors
import javax.net.ssl.HttpsURLConnection

interface WebManager {
    enum class RequestMethod(val method: String) {
        GET("GET"),
        POST("POST")
    }

    enum class LANGUAGE(val value: String) {
        RU("ru-RU"),
        EN("en-US"),
    }

    enum class REGION(val value: String) {
        RU("ru"),
        EN("en"),
    }

    fun getBaseURL(): String

    @Throws(Throwable::class)
    fun getResultRequest(
        path: String,
        requestMethod: RequestMethod = RequestMethod.GET,
        lang: LANGUAGE = LANGUAGE.RU,
        region: REGION = REGION.RU,
    ): String {
        var error: Throwable

        try {
            val uri = URL(getBaseURL() +
                    path +
                    "?api_key=${BuildConfig.API_KEY}" +
                    "&language=${lang.value}" +
                    "&region=${region.value}"
            )

            lateinit var urlConnection: HttpsURLConnection

            try {
                urlConnection = uri.openConnection() as HttpsURLConnection
                urlConnection.requestMethod = requestMethod.method
                urlConnection.readTimeout = 10000

                return getLines(BufferedReader(InputStreamReader(urlConnection.inputStream)))
            } catch (e: Exception) {
                error = Throwable("Ошибка выполнения запроса")
            } finally {
                urlConnection.disconnect()
            }
        } catch (e: Throwable) {
            error = e
        }

        throw error
    }

    private fun getLines(reader: BufferedReader): String {
        return reader.lines().collect(Collectors.joining("\n"))
    }
}