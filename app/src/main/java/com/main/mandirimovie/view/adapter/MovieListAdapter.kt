package com.main.mandirimovie.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.main.mandirimovie.data.model.GoToMovie
import com.main.mandirimovie.data.model.InfiniteScrollListener
import com.main.mandirimovie.data.model.entity.Movie
import com.main.mandirimovie.databinding.ListItemMovieBinding

class MovieListAdapter internal constructor(
    private val goToMovie: GoToMovie,
    private val infiniteScrollListener: InfiniteScrollListener
) : ListAdapter<(Movie), MovieListAdapter.ViewHolder>(MovieDiffCallback()) {

    class ViewHolder(private val binding: ViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(GoToMovie: GoToMovie, item: Movie) {
            when (binding) {
                is ListItemMovieBinding -> {
                    binding.goToInterface = GoToMovie
                    binding.movie = item
                    binding.executePendingBindings()
                }
                else -> throw Exception("Invalid list binding")
            }
        }
    }

    override fun submitList(list: List<Movie>?) {
        val newList: MutableList<Movie> = arrayListOf()
        if (list != null) newList.addAll(list)
        super.submitList(newList)
        infiniteScrollListener.itemsLoaded()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(goToMovie, getItem(position))
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
//        if (recyclerView.layoutManager is GridLayoutManager) isMovieItemGrid = true
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding = ListItemMovieBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    private class MovieDiffCallback : DiffUtil.ItemCallback<Movie>() {
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }
    }
}