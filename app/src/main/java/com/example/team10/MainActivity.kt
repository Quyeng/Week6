package com.example.team10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.team10.activity.boarding.BoardingOneActivity
import com.example.team10.activity.boarding.BoardingThreeActivity
import com.example.team10.activity.boarding.BoardingTwoActivity

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BoardingOneActivity>(R.id.frag)
        }
    }
    override fun onStart() {
        super.onStart()
//        mainViewModel.getNowPlaying()
        mainViewModel.getTopRated()
    }
}