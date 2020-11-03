package com.sammy.koin.data.api

import com.sammy.koin.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers():Response<List<User>>
}