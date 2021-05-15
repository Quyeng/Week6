package com.example.team10

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.team10.rest.RestClient
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    fun getNowPlaying() {
        viewModelScope.launch {
            val movieResp = RestClient.getInstance().API.listNowPlayMovies(
                language = "en-US",
                page = 1,
            )
            Log.e("TAG", movieResp.results.toString())
        }
    }

    fun getTopRated() {
        viewModelScope.launch {
            val movieResp = RestClient.getInstance().API.listUpComingMovies(
                language = "en-US",
                page = 1,
            )
            Log.e("TAG++++ upcomming", movieResp.results.toString())
        }
    }
}





















