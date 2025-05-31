package com.konkuk.kuitnewprojectsetting.data.mapper

import com.konkuk.kuitnewprojectsetting.data.dto.response.ResponseHomeDto
import com.konkuk.kuitnewprojectsetting.domain.entity.HomeModel

fun ResponseHomeDto.toHomeModel() = HomeModel(
    homeTitle = homeTitle,
    homeSubTitle = homeSubTitle
)