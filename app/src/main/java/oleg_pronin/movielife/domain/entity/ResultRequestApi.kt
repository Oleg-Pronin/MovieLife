package oleg_pronin.movielife.domain.entity

data class ResultRequestApi(
    var body: String = "",
    var error: Throwable? = null
)
