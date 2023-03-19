package com.main.mandirimovie.data.model.network

import com.google.gson.annotations.SerializedName
import com.main.mandirimovie.data.model.entity.Genre

data class GenreListResponse (
    @SerializedName("genres")
    override var results: List<Genre>
) : BaseListResponse<Genre>