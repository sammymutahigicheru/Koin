package com.sammy.koin.data.repository

import com.sammy.koin.data.api.ApiHelper


class MainRepository (private val apiHelper: ApiHelper){
    suspend fun getUsers() = apiHelper.getUsers()
}