package oleg_pronin.movielife.data.net

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import oleg_pronin.movielife.data.net.api.TheMovieDbApi
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.entity.dto.PageDto
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MoviesRepoImpl : MoviesRepo {
    override fun getLatestMovies(): Movie {
        val result = TheMovieDbApi.getResultRequest("/movie/latest")

        if (result.error != null) {
            throw Throwable(result.error)
        }

        return GsonBuilder().create().fromJson(
            result.body,
            Movie::class.java
        )
    }

    override fun getNowPlayingMovies(): List<Movie> {
        val result = TheMovieDbApi.getResultRequest("/movie/now_playing")

        if (result.error != null) {
            throw Throwable(result.error)
        }
        
        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            result.body,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getPopularMovies(): List<Movie> {
        val result = TheMovieDbApi.getResultRequest("/movie/popular")

        if (result.error != null) {
            throw Throwable(result.error)
        }

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            result.body,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getTopRatedMovies(): List<Movie> {
        val result = TheMovieDbApi.getResultRequest("/movie/top_rated")

        if (result.error != null) {
            throw Throwable(result.error)
        }

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            result.body,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getUpcomingMovies(): List<Movie> {
        val result = TheMovieDbApi.getResultRequest("/movie/upcoming")

        if (result.error != null) {
            throw Throwable(result.error)
        }

        val objectClass: PageDto<Movie> = GsonBuilder().create().fromJson(
            result.body,
            object : TypeToken<PageDto<Movie>>() {}.type
        )

        return objectClass.results
    }

    override fun getDetailMovie(id: Int): Movie {
        val result = TheMovieDbApi.getResultRequest("/movie/${id}")

        if (result.error != null) {
            throw Throwable(result.error)
        }

        return GsonBuilder().create().fromJson(
            result.body,
            Movie::class.java
        )
    }
}