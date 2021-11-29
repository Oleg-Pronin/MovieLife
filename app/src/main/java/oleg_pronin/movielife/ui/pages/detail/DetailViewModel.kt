package oleg_pronin.movielife.ui.pages.detail

import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.repository.MoviesRepo

class DetailViewModel : ViewModel(), DetailContract.ViewModal {
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun getDetailMovieById(id: Int): Movie {
        return movieRepo.getDetailMovie(id)
    }
}