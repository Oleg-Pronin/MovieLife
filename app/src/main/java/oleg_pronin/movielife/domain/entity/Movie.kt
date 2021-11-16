package oleg_pronin.movielife.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Movie(
    var id: Int,
    var name: String,
    var description: String,
    var date: Date = Date(),
) : Parcelable
