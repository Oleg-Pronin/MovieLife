package oleg_pronin.movielife.data.net.api

import oleg_pronin.movielife.domain.manager.WebManager

object TheMovieDbApi : WebManager {

    override fun getBaseURL(): String {
        return "https://api.themoviedb.org/3"
    }
}