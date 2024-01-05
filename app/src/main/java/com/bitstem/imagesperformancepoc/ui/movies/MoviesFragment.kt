package com.bitstem.imagesperformancepoc.ui.movies

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import coil.imageLoader
import com.bitstem.imagesperformancepoc.R
import com.bitstem.imagesperformancepoc.databinding.FragmentMoviesBinding
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoviesFragment : Fragment(R.layout.fragment_movies) {

    private val viewModel: MoviesViewModel by viewModels()
    private lateinit var binding: FragmentMoviesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMoviesBinding.bind(view)
        binding.moviesRecyclerView.layoutManager = LinearLayoutManager(context)
        val data = viewModel.dummyData()
        binding.moviesRecyclerView.adapter = MoviesAdapter(data)

        binding.fab.setOnClickListener {

//            // Glide
//            Glide.get(context!!).clearMemory()

            // Coil
            context!!.imageLoader.memoryCache!!.clear()
        }
    }
}