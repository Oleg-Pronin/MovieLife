package oleg_pronin.movielife.ui.pages.soon

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.domain.repository.MoviesRepo

class SoonViewModel : ViewModel(), SoonContract.ViewModel {
    override var soonMovieList = MutableLiveData<List<Movie>>()
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun getSoonMovieList() {
        soonMovieList.postValue(movieRepo.getUpcomingMovies())
    }
}