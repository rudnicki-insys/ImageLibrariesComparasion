package com.bitstem.imagesperformancepoc.ui.movies

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bitstem.imagesperformancepoc.R
import com.bitstem.imagesperformancepoc.data.Movie
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MoviesAdapter(private val movies: Array<Movie>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleView: TextView
        val descView: TextView
        val imgView: ImageView

        init {
            // Define click listener for the ViewHolder's View
            titleView = view.findViewById(R.id.titleTxtView)
            descView = view.findViewById(R.id.descTxtView)
            imgView = view.findViewById(R.id.imageView)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.movie_row_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.titleView.text = movies[position].title
        viewHolder.descView.text = movies[position].desc

//        // Glide impl
//        Glide
//            .with(viewHolder.imgView.context)
//            .load(movies[position].img)
//            .diskCacheStrategy(DiskCacheStrategy.ALL)
//            .into(viewHolder.imgView)

        // Coil impl
        viewHolder.imgView.load(movies[position].img)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = movies.size

}