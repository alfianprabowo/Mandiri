package com.main.mandirimovie.data.remote


import androidx.lifecycle.LiveData
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService {

//    @GET("/$API_VERSION/movie/popular")
//    fun fetchPopularList(@Query("page") page: Int): Call<MoviesResponse>
//
//    @GET("/$API_VERSION/movie/upcoming")
//    fun fetchUpcomingList(@Query("page") page: Int): Call<MoviesResponse>
//
//    @GET("/$API_VERSION/movie/now_playing")
//    fun fetchInTheatersList(@Query("page") page: Int): Call<MoviesResponse>
//
//    @GET("/$API_VERSION/discover/movie")
//    fun fetchDiscoverList(@Query("page") page: Int): Call<MoviesResponse>
//
//    @GET("/$API_VERSION/movie/{id}")
//    fun fetchDetails(@Path("id") id: Int): Call<Movie>
//
//    @GET("/$API_VERSION/movie/{id}/credits")
//    fun fetchCredits(@Path("id") id: Int): Call<CreditsResponse>
//
//    @GET("/$API_VERSION/movie/{id}/videos")
//    fun fetchVideos(@Path("id") id: Int): Call<VideosResponse>
//
//    @GET("/$API_VERSION/genre/movie/list")
//    fun fetchMovieGenreList(): Call<GenresResponse>

    /**
     * [Movie Keywords](https://developers.themoviedb.org/3/movies/get-movie-keywords)
     *
     * Get the keywords that have been added to a movie.
     *
     * @param [id] Specify the id of movie id.
     *
     * @return [KeywordListResponse] response
     */
//    @GET("/3/movie/{movie_id}/keywords")
//    fun fetchKeywords(@Path("movie_id") id: Int): LiveData<ApiResponse<KeywordListResponse>>

    /**
     * [Movie Videos](https://developers.themoviedb.org/3/movies/get-movie-videos)
     *
     * Get the videos that have been added to a movie.
     *
     * @param [id] Specify the id of movie id.
     *
     * @return [VideoListResponse] response
     */
//    @GET("/3/movie/{movie_id}/videos")
//    fun fetchVideos(@Path("movie_id") id: Int): LiveData<ApiResponse<VideoListResponse>>

    /**
     * [Movie Reviews](https://developers.themoviedb.org/3/movies/get-movie-reviews)
     *
     * Get the user reviews for a movie.
     *
     * @param [id] Specify the id of movie id.
     *
     * @return [ReviewListResponse] response
     */
//    @GET("/3/movie/{movie_id}/reviews")
//    fun fetchReviews(@Path("movie_id") id: Int): LiveData<ApiResponse<ReviewListResponse>>
}