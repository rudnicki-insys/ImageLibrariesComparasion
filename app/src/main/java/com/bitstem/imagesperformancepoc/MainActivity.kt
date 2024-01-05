package com.bitstem.imagesperformancepoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitstem.imagesperformancepoc.ui.movies.MoviesFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MoviesFragment())
                .commitNow()
        }
    }
}