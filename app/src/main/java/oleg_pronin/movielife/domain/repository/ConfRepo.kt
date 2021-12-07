package oleg_pronin.movielife.domain.repository

import oleg_pronin.movielife.domain.entity.ImageConfigure

interface ConfRepo {
    // TODO: API https://developers.themoviedb.org/3/configuration/get-api-configuration
    fun getConfiguration(): ImageConfigure
}