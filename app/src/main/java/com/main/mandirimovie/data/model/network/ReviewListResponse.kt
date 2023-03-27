package com.main.mandirimovie.data.model.network

import com.google.gson.annotations.SerializedName
import com.main.mandirimovie.data.model.entity.Review

data class ReviewListResponse (
    @SerializedName("page")
    override var page: Int,

    @SerializedName("results")
    override var results: List<Review>
)  : BasePageListResponse<Review>