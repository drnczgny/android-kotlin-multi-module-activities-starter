package com.adrian.project.di

import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.home.di.MainModule
import com.adrian.project.home.view.MainActivity
import com.adrian.project.jsonplaceholder.di.JsonPlaceholderFragmentBuilderModule
import com.adrian.project.jsonplaceholder.di.JsonPlaceholderModule
import com.adrian.project.jsonplaceholder.subpages.postpage.di.PostsPageModule
import com.adrian.project.jsonplaceholder.view.JsonPlaceholderActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(JsonPlaceholderModule::class, PostsPageModule::class, JsonPlaceholderFragmentBuilderModule::class))
    abstract fun bindJsonPlaceholderActivity(): JsonPlaceholderActivity

}