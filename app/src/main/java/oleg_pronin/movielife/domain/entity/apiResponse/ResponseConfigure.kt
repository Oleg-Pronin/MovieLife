package oleg_pronin.movielife.domain.entity.apiResponse

import com.google.gson.annotations.SerializedName
import oleg_pronin.movielife.domain.entity.ImageConfigure

data class ResponseConfigure (
    @SerializedName("images")
    val images: ImageConfigure,
    @SerializedName("change_keys")
    val changeKeys: List<String>,
)
