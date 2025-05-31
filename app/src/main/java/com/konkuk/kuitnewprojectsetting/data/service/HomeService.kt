package com.konkuk.kuitnewprojectsetting.data.service

import com.konkuk.kuitnewprojectsetting.data.dto.response.BaseResponse
import com.konkuk.kuitnewprojectsetting.data.dto.response.ResponseHomeDto
import retrofit2.http.Body
import retrofit2.http.GET

interface HomeService {
    @GET("home")
    suspend fun getHomeData(
        @Body request: Int
    ): BaseResponse<ResponseHomeDto>
}