package oleg_pronin.movielife.ui.pages.movie

import androidx.lifecycle.MutableLiveData
import oleg_pronin.movielife.AppState

class MovieContract {
    interface ViewModel {
        val mainMovieList: MutableLiveData<AppState>

        fun setMainMovieList()
    }
}