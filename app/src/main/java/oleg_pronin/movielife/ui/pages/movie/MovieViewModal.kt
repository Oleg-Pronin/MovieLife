package oleg_pronin.movielife.ui.pages.movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.AppState
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MovieViewModal : ViewModel(), MovieContract.ViewModel {
    override val mainMovieList = MutableLiveData<AppState>()
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun getMainMovieList() {
        try {
            mainMovieList.postValue(AppState.Loading)

            Thread {
                Thread.sleep(2000)

                mainMovieList.postValue(AppState.Success(movieRepo.getPopularMovies()))
            }.start()
        } catch (error: Throwable) {
            mainMovieList.postValue(AppState.Error(error))
        }
    }
}