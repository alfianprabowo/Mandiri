package com.main.mandirimovie.data.remote

import com.main.mandirimovie.data.model.entity.Movie
import com.main.mandirimovie.data.model.network.GenreListResponse
import com.main.mandirimovie.data.model.network.MovieListResponse
import com.main.mandirimovie.data.model.network.VideoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

object Api {

//    private val BASE_API_URL= "https://api.themoviedb.org"
    private const val API_VERSION: Int = 3

    interface MovieService {

        @GET("/$API_VERSION/discover/movie")
        fun fetchDiscoverList(@Query("page") page: Int): Call<MovieListResponse>

        @GET("/$API_VERSION/movie/{id}")
        fun fetchDetails(@Path("id") id: Int): Call<Movie>

        @GET("/$API_VERSION/movie/{id}/videos")
        fun fetchVideos(@Path("id") id: Int): Call<VideoResponse>

        @GET("/$API_VERSION/genre/movie/list")
        fun fetchMovieGenreList(): Call<GenreListResponse>
    }
//    private const val BASE_POSTER_PATH = "https://image.tmdb.org/t/p/w342"
//    private const val BASE_BACKDROP_PATH = "https://image.tmdb.org/t/p/w780"
//    private const val YOUTUBE_VIDEO_URL = "https://www.youtube.com/watch?v="
//    private const val YOUTUBE_THUMBNAIL_URL = "https://img.youtube.com/vi/"
//
//    fun getPosterPath(posterPath: String): String {
//        return BASE_POSTER_PATH + posterPath
//    }
//
//    fun getBackdropPath(backdropPath: String): String {
//        return BASE_BACKDROP_PATH + backdropPath
//    }
//
//    fun getYoutubeVideoPath(videoPath: String): String {
//        return YOUTUBE_VIDEO_URL + videoPath
//    }
//
//    fun getYoutubeThumbnailPath(thumbnailPath: String): String {
//        return "$YOUTUBE_THUMBNAIL_URL$thumbnailPath/default.jpg"
//    }

}