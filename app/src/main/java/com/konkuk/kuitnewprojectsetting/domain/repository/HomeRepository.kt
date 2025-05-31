package com.konkuk.kuitnewprojectsetting.domain.repository

import com.konkuk.kuitnewprojectsetting.domain.entity.HomeModel

interface HomeRepository {
    suspend fun getHomeData(request: Int): Result<HomeModel>
}
