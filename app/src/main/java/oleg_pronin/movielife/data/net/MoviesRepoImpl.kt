package oleg_pronin.movielife.data.net

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import oleg_pronin.movielife.data.net.api.TheMovieDbApi
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.entity.dto.PageDto
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MoviesRepoImpl : MoviesRepo {
    override fun getLatestMovies(): Movie {
        val jsonString = TheMovieDbApi.getResultRequest("/movie/latest")

        return GsonBuilder().create().fromJson(
            jsonString,
            Movie::class.java
        )
    }

    override fun getNowPlayingMovies(): List<Movie> {
        val jsonString = TheMovieDbApi.getResultRequest("/movie/now_playing")

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            jsonString,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getPopularMovies(): List<Movie> {
        val jsonString = TheMovieDbApi.getResultRequest("/movie/popular")

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            jsonString,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getTopRatedMovies(): List<Movie> {
        val jsonString = TheMovieDbApi.getResultRequest("/movie/top_rated")

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            jsonString,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getUpcomingMovies(): List<Movie> {
        val jsonString = TheMovieDbApi.getResultRequest("/movie/upcoming")

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            jsonString,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getDetailMovie(id: Int): Movie {
        val jsonString = TheMovieDbApi.getResultRequest("/movie/${id}")

        return GsonBuilder().create().fromJson(
            jsonString,
            Movie::class.java
        )
    }
}