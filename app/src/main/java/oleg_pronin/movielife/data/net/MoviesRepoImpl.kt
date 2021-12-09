package oleg_pronin.movielife.data.net

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.entity.dto.PageDTO
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MoviesRepoImpl : MoviesRepo, Api() {
    override fun getLatestMovies(): Movie {
        val jsonString = makeRequestAPI(RequestMethod.GET, "/movie/latest")

        val builder = GsonBuilder()

        return builder.create().fromJson(
            jsonString,
            Movie::class.java
        )
    }

    override fun getNowPlayingMovies(): List<Movie> {
        val jsonString = makeRequestAPI(RequestMethod.GET, "/movie/now_playing")

        val builder = GsonBuilder()
        val objectClass: PageDTO<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<PageDTO<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getPopularMovies(): List<Movie> {
        val jsonString = makeRequestAPI(RequestMethod.GET, "/movie/popular")

        val builder = GsonBuilder()
        val objectClass: PageDTO<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<PageDTO<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getTopRatedMovies(): List<Movie> {
        val jsonString = makeRequestAPI(RequestMethod.GET, "/movie/top_rated")

        val builder = GsonBuilder()
        val objectClass: PageDTO<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<PageDTO<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getUpcomingMovies(): List<Movie> {
        val jsonString = makeRequestAPI(RequestMethod.GET, "/movie/upcoming")

        val builder = GsonBuilder()
        val objectClass: PageDTO<Movie> = builder.create().fromJson(
            jsonString,
            object : TypeToken<PageDTO<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getDetailMovie(id: Int): Movie {
        val jsonString = makeRequestAPI(RequestMethod.GET, "/movie/${id}")

        val builder = GsonBuilder()
        return builder.create().fromJson(
            jsonString,
            Movie::class.java
        )
    }
}