package com.example.team10.rest

import com.example.team10.movie.MovieResp
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieDBService {

    @GET("movie/now_playing")
    suspend fun listNowPlayMovies(
        @Query("language") language: String,
        @Query("page") page: Int,
    ): MovieResp

    ///movie/top_rated
    @GET("movie/top_rated")
    suspend fun listUpComingMovies(
        @Query("language") language: String,
        @Query("page") page: Int,
    ): MovieResp
}