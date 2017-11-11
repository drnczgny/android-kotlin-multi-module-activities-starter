package com.adrian.project.jsonplaceholder.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.adrian.project.jsonplaceholder.R
import com.adrian.project.jsonplaceholder.subpages.postpage.view.PostsPageFragment
import com.adrian.project.ui.jsonplaceholder.submodules.postspage.JsonPlaceholderModel
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class JsonPlaceholderActivity : AppCompatActivity(), JsonPlaceholderRouter, HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var jsonPlaceholderModel: JsonPlaceholderModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_posts_page)

        jsonPlaceholderModel.callApiService()

        openPostsPageFragment(savedInstanceState)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }

    fun openPostsPageFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null)
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.postsPageContainer, PostsPageFragment.newInstance())
                    .commitAllowingStateLoss()
    }
}
