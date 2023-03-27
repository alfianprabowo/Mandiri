package com.main.mandirimovie.data.model.network

import com.google.gson.annotations.SerializedName
import com.main.mandirimovie.data.model.entity.Video

data class VideoListResponse (
    @SerializedName("results")
    override var results: List<Video>
)  : BaseListResponse<Video>