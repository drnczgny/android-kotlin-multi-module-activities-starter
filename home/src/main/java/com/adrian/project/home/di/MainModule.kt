package com.adrian.project.home.di

import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.home.model.MainModel
import com.adrian.project.home.service.ApiService
import com.adrian.project.home.view.MainActivity
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
class MainModule {

    @ActivityScope
    @Provides
    fun providesMainRouter(mainActivity: MainActivity) = mainActivity

    @ActivityScope
    @Provides
    fun provideMainModel(apiService: ApiService) = MainModel(apiService)

    @ActivityScope
    @Provides
    fun provideApiService() = ApiService()
}