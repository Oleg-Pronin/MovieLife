package oleg_pronin.movielife.ui.pages.detail

import androidx.lifecycle.LiveData
import oleg_pronin.movielife.AppState

class DetailContract {
    interface ViewModal {
        val detailMovie: LiveData<AppState>

        fun getDetailMovieById(id: Int)
    }
}