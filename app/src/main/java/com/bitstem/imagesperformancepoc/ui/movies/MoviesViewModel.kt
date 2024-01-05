package com.bitstem.imagesperformancepoc.ui.movies

import androidx.lifecycle.ViewModel
import com.bitstem.imagesperformancepoc.data.Movie
import com.bitstem.imagesperformancepoc.service.IScreenManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val screenManager: IScreenManager
) : ViewModel() {

    fun dummyData() : Array<Movie> {
        var length = 100
        var width = screenManager.screenWidth()
        val movies = mutableListOf<Movie>()
        for (i in 1..length) {
            movies.add(Movie(i.toLong(), "Title", "Description", "https://picsum.photos/${width}/600?random=${i}"))
        }
        return movies.toTypedArray();
    }
}