package com.sammy.koin.di

import com.sammy.koin.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module{
    single { MainRepository(get()) }
}