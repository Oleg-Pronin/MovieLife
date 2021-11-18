package oleg_pronin.movielife.util

import oleg_pronin.movielife.domain.entity.Movie

sealed class AppState {
    data class Success(val data: List<Movie>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}