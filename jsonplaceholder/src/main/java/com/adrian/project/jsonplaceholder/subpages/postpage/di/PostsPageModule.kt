package com.adrian.project.jsonplaceholder.subpages.postpage.di

import com.adrian.project.jsonplaceholder.service.ApiService
import com.adrian.project.jsonplaceholder.subpages.postpage.view.PostsPageFragment
import com.adrian.project.jsonplaceholder.subpages.postpage.view.PostsPageRouter
import com.adrian.project.scope.FragmentScope
import com.adrian.project.ui.jsonplaceholder.model.PostsPageModel
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class PostsPageModule {

    @FragmentScope
    @Provides
    fun providesPostsPageRouter(postsPageFragment: PostsPageFragment): PostsPageRouter = postsPageFragment

    @FragmentScope
    @Provides
    fun providesPostsPageModel(apiService: ApiService) = PostsPageModel(apiService)

}