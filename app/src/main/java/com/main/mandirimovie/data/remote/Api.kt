package com.main.mandirimovie.data.remote

import com.main.mandirimovie.data.model.entity.Movie
import com.main.mandirimovie.data.model.network.GenreListResponse
import com.main.mandirimovie.data.model.network.MovieListResponse
import com.main.mandirimovie.data.model.network.VideoListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

object Api {

//    private val BASE_API_URL= "https://api.themoviedb.org"
    private const val API_VERSION: Int = 3
    private const val BASE_POSTER_URL = "https://image.tmdb.org/t/p/w185"
    private const val BASE_YT_IMG_URL = "https://img.youtube.com/vi/"

    fun getYoutubeImageUrl(youtubeId: String) = "$BASE_YT_IMG_URL$youtubeId/hqdefault.jpg"
    fun getPosterUrl(path: String) = BASE_POSTER_URL + path

    interface MovieService {

        @GET("/$API_VERSION/discover/movie")
        fun fetchDiscoverList(@Query("page") page: Int): Call<MovieListResponse>

        @GET("/$API_VERSION/movie/{id}")
        fun fetchDetails(@Path("id") id: Int): Call<Movie>

        @GET("/$API_VERSION/movie/{id}/videos")
        fun fetchVideos(@Path("id") id: Int): Call<VideoListResponse>

        @GET("/$API_VERSION/genre/movie/list")
        fun fetchMovieGenreList(): Call<GenreListResponse>
    }

}