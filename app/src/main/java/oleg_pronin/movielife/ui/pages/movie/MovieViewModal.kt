package oleg_pronin.movielife.ui.pages.movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MovieViewModal : ViewModel(),
    MovieContract.ViewModel {
    override val mainMovieList = MutableLiveData<List<Movie>>()
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun getMainMovieList() {
        mainMovieList.postValue(movieRepo.getTopRatedMovies())
    }
}