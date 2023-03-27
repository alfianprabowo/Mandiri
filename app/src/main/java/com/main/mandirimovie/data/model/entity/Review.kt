package com.main.mandirimovie.data.model.entity

import com.google.gson.annotations.SerializedName

data class Review(
    @SerializedName("id")
    var id: String,

    @SerializedName("author")
    val author: String,

    @SerializedName("content")
    val content: String,

    @SerializedName("url")
    val url: String
    )

