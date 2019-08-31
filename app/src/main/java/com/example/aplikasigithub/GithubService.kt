package com.example.aplikasigithub

import retrofit2.http.GET
import retrofit2.Call

interface GithubService {

    @GET("users")
    fun getUsers(): Call<List<GithubUser>>

}