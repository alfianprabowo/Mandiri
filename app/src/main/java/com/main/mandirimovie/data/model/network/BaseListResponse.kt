package com.main.mandirimovie.data.model.network

interface BaseListResponse <T> {
    var results: List<T>
}