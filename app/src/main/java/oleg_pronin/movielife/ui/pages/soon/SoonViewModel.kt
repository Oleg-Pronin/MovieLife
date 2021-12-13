package oleg_pronin.movielife.ui.pages.soon

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.AppState
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.repository.MoviesRepo

class SoonViewModel : ViewModel(), SoonContract.ViewModel {
    override var soonMovieList = MutableLiveData<AppState>()
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun setSoonMovieList() {
        try {
            soonMovieList.postValue(AppState.Loading)

            Thread {
                Thread.sleep(2000)

                soonMovieList.postValue(AppState.Success(movieRepo.getUpcomingMovies()))
            }.start()
        } catch (error: Throwable) {
            soonMovieList.postValue(AppState.Error(error))
        }
    }
}