package oleg_pronin.movielife.ui.pages.soon

import androidx.lifecycle.LiveData
import oleg_pronin.movielife.AppState

class SoonContract {
    interface ViewModel{
        val soonMovieList: LiveData<AppState>

        fun getSoonMovieList()
    }
}