package com.sammy.koin.di

import com.sammy.koin.ui.MainViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { MainViewModel(get(),get()) }
}