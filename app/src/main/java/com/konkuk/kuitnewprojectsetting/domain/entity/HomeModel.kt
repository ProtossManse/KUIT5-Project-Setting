package com.konkuk.kuitnewprojectsetting.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class HomeModel(
    val homeTitle: String,
    val homeSubTitle: String
)
