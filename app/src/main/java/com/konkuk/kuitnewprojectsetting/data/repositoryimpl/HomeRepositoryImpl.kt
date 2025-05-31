package com.konkuk.kuitnewprojectsetting.data.repositoryimpl

import com.konkuk.kuitnewprojectsetting.data.mapper.toHomeModel
import com.konkuk.kuitnewprojectsetting.data.service.HomeService
import com.konkuk.kuitnewprojectsetting.domain.entity.HomeModel
import com.konkuk.kuitnewprojectsetting.domain.repository.HomeRepository
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val homeService: HomeService
) : HomeRepository {
    override suspend fun getHomeData(request: Int): Result<HomeModel> =
        runCatching {
            val response = homeService.getHomeData(request)
            response.data.toHomeModel()
        }

}