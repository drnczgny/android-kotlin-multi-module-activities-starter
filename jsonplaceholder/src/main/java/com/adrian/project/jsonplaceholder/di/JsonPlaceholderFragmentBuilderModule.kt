package com.adrian.project.jsonplaceholder.di

import com.adrian.project.jsonplaceholder.subpages.postpage.di.PostsPageModule
import com.adrian.project.jsonplaceholder.subpages.postpage.view.PostsPageFragment
import com.adrian.project.scope.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
abstract class JsonPlaceholderFragmentBuilderModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(PostsPageModule::class))
    abstract fun bindPostsPageFragment(): PostsPageFragment

}
