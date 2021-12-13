package oleg_pronin.movielife.ui.pages.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import oleg_pronin.movielife.AppState
import oleg_pronin.movielife.data.net.MoviesRepoImpl
import oleg_pronin.movielife.domain.repository.MoviesRepo

class DetailViewModel : ViewModel(), DetailContract.ViewModal {
    override val detailMovie = MutableLiveData<AppState>()
    private val movieRepo: MoviesRepo by lazy { MoviesRepoImpl() }

    override fun setDetailMovieById(id: Int) {
        try {
            detailMovie.postValue(AppState.Loading)

            Thread {
                try {
                    detailMovie.postValue(AppState.Success(movieRepo.getDetailMovie(id)))
                } catch (error: Throwable) {
                    detailMovie.postValue(AppState.Error(error))
                }
            }.start()
        } catch (error: Throwable) {
            detailMovie.postValue(AppState.Error(error))
        }
    }
}