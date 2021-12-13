package oleg_pronin.movielife.domain.entity.dto

import com.google.gson.annotations.SerializedName

data class PageDto<T>(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<T>,
    @SerializedName("total_results")
    val totalResults: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
)
