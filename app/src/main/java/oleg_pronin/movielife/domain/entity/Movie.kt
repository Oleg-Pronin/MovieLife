package oleg_pronin.movielife.domain.entity

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val name: String,
    @SerializedName("overview")
    val description: String,
    @SerializedName("release_date")
    val date: String = "",
    @SerializedName("vote_average")
    val voteAverage: Float = 0F
)
