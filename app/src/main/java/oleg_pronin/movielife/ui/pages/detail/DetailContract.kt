package oleg_pronin.movielife.ui.pages.detail

import oleg_pronin.movielife.AppState

class DetailContract {
    interface ViewModal {
        fun getDetailMovieById(id: Int): AppState
    }
}