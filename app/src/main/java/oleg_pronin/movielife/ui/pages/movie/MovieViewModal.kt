package oleg_pronin.movielife.ui.pages.movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.AppState
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.repository.MoviesRepo

class MovieViewModal : ViewModel(), MovieContract.ViewModel {
    override val mainMovieList = MutableLiveData<AppState>()
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun setMainMovieList() {
        try {
            mainMovieList.postValue(AppState.Loading)

            Thread {
                mainMovieList.postValue(
                    try {
                        AppState.Success(movieRepo.getNowPlayingMovies())
                    } catch (error: Throwable) {
                        AppState.Error(error)
                    }
                )
            }.start()
        } catch (error: Throwable) {
            mainMovieList.postValue(AppState.Error(error))
        }
    }
}