package com.adrian.project.jsonplaceholder.di

import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.jsonplaceholder.service.ApiService
import com.adrian.project.jsonplaceholder.view.JsonPlaceholderActivity
import com.adrian.project.jsonplaceholder.view.JsonPlaceholderRouter
import com.adrian.project.ui.jsonplaceholder.submodules.postspage.JsonPlaceholderModel
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class JsonPlaceholderModule {

    @ActivityScope
    @Provides
    fun providesJsonPlaceholderRouter(jsonPlaceholderActivity: JsonPlaceholderActivity): JsonPlaceholderRouter = jsonPlaceholderActivity


    @ActivityScope
    @Provides
    fun providesJsonPlaceholderModel(apiService: ApiService) = JsonPlaceholderModel(apiService)

    @ActivityScope
    @Provides
    fun provideApiService() = ApiService()
}