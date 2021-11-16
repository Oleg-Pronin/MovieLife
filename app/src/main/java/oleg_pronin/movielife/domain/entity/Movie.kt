package oleg_pronin.movielife.domain.entity

import java.util.*

data class Movie(
    var id: Int,
    var name: String,
    var description: String,
    var date: Date = Date(),
)
