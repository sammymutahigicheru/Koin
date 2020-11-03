package com.sammy.koin.data.repository

import com.sammy.koin.data.api.ApiHelperImpl

class MainRepository (private val apiHelperImpl: ApiHelperImpl){
    suspend fun getUsers() = apiHelperImpl.getUsers()
}