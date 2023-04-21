package com.example.tvapp

import android.app.Application
import com.example.tvapp.api.ApiService
import com.example.tvapp.api.RetrofitHelper
import com.example.tvapp.api.TmdbRepo

class MyApplication : Application() {

    lateinit var tmdbRepo : TmdbRepo

    override fun onCreate() {
        super.onCreate()

        init()
    }

    private fun init(){
        val service = RetrofitHelper.getInstance().create(ApiService::class.java)
        tmdbRepo = TmdbRepo(service)
    }
}