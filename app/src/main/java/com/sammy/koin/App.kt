package com.sammy.koin

import android.app.Application
import com.sammy.koin.di.appModule
import com.sammy.koin.di.repoModule
import com.sammy.koin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}