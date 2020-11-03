package com.sammy.koin.data.api

import com.sammy.koin.data.model.User
import retrofit2.Response

class ApiHelperImpl (private val apiService: ApiService):ApiHelper{
    override suspend fun getUsers(): Response<List<User>> =
        apiService.getUsers()

}