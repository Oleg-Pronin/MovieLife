package oleg_pronin.movielife.domain.entity.dto

import com.google.gson.annotations.SerializedName
import oleg_pronin.movielife.domain.entity.ImageConfigure

data class ConfigureDTO (
    @SerializedName("images")
    val images: ImageConfigure,
    @SerializedName("change_keys")
    val changeKeys: List<String>,
)
