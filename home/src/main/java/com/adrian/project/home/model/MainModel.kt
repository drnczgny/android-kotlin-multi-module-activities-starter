package com.adrian.project.home.model

import com.adrian.project.home.service.ApiService


/**
 * Created by cadri on 2017. 08. 03..
 */

class MainModel constructor(val apiService: ApiService) {

    fun callApiService() {
        apiService.fakeApiCall()
    }
}