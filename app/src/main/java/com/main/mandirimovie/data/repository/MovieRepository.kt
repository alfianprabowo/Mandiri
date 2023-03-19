package com.main.mandirimovie.data.repository

import androidx.lifecycle.MutableLiveData
import com.main.mandirimovie.data.model.entity.Genre
import com.main.mandirimovie.data.model.entity.Movie
import com.main.mandirimovie.data.remote.Api
import com.main.mandirimovie.util.ServiceBuilder

class MovieRepository:BaseRepository() {
    private val movieService =
        ServiceBuilder.buildService(Api.MovieService::class.java)

    suspend fun loadDiscoverList(page: Int, errorText: (String) -> Unit) =
        loadPageListCall(
            { movieService.fetchDiscoverList(page) },
            MutableLiveData<List<Movie>>(),
            errorText
        )

    suspend fun loadDetails(id: Int, errorText: (String) -> Unit) =
        loadCall({ movieService.fetchDetails(id) }, MutableLiveData<Movie>(), errorText)

    suspend fun loadGenreList(errorText: (String) -> Unit) = loadListCall(
        { movieService.fetchMovieGenreList() },
        MutableLiveData<List<Genre>>(),
        errorText
    )
}