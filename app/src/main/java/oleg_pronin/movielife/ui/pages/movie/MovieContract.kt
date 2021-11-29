package oleg_pronin.movielife.ui.pages.movie

import androidx.lifecycle.LiveData
import oleg_pronin.movielife.domain.entity.Movie

class MovieContract {
    interface ViewModel {
        val mainMovieList: LiveData<List<Movie>>

        fun getMainMovieList()
    }
}