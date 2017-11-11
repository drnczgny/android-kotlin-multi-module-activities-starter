package com.adrian.project.home.view

import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.adrian.project.home.R
import com.adrian.project.home.model.MainModel
import com.adrian.project.jsonplaceholder.view.JsonPlaceholderActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainRouter {

    @Inject
    lateinit var mainModel: MainModel

    lateinit var btnPostsPage: Button

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        dagger.android.AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        mainModel.callApiService()

        btnPostsPage = findViewById(R.id.btnPostsPage)
        btnPostsPage.setOnClickListener { openPostsPage() }
    }

    fun openPostsPage() {
        val intent = android.content.Intent(this, JsonPlaceholderActivity::class.java)
        startActivity(intent)
    }
}
