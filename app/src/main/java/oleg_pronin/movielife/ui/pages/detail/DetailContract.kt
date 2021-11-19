package oleg_pronin.movielife.ui.pages.detail

import oleg_pronin.movielife.domain.entity.Movie

class DetailContract {
    interface ViewModal {
        fun getDetailMovieById(id: Int): Movie
    }
}