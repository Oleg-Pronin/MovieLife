package oleg_pronin.movielife.domain.repository

import oleg_pronin.movielife.domain.entity.Movie

interface MoviesRepo {
    // TODO: API https://developers.themoviedb.org/3/movies/get-latest-movie
    fun getLatestMovies(): Movie

    // TODO: API https://developers.themoviedb.org/3/movies/get-now-playing
    fun getNowPlayingMovies(): List<Movie>

    // TODO: API https://developers.themoviedb.org/3/movies/get-popular-movies
    fun getPopularMovies(): List<Movie>

    // TODO: API https://developers.themoviedb.org/3/movies/get-top-rated-movies
    fun getTopRatedMovies(): List<Movie>

    // TODO: API https://developers.themoviedb.org/3/movies/get-upcoming
    fun getUpcomingMovies(): List<Movie>

    // TODO: API https://developers.themoviedb.org/3/movies/get-movie-details
    fun getDetailMovie(id: Int): Movie
}