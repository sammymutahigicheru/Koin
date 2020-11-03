package com.sammy.koin.data.api

import com.sammy.koin.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers():Response<List<User>>
}