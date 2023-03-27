package com.main.mandirimovie.data.model

import androidx.lifecycle.MutableLiveData
import com.main.mandirimovie.data.model.entity.*

interface GoToMovie {
    val goToMovieDetailsEvent: MutableLiveData<Event<Movie>>

    fun goTo(movie: Movie) {
        goToMovieDetailsEvent.value = Event(movie)
    }
}

interface GoToVideo {
    val goToVideoEvent: MutableLiveData<Event<Video>>

    fun goTo(video: Video) {
        goToVideoEvent.value = Event(video)
    }
}