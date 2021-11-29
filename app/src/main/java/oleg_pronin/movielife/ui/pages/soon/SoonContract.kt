package oleg_pronin.movielife.ui.pages.soon

import androidx.lifecycle.LiveData
import oleg_pronin.movielife.domain.entity.Movie

class SoonContract {
    interface ViewModel{
        val soonMovieList: LiveData<List<Movie>>

        fun getSoonMovieList()
    }
}