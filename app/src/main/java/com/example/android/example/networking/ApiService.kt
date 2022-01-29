package com.example.android.example.networking

import com.example.android.example.data.PhotosSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("?method=flickr.photos.search&format=json&nojsoncallback=1&api_key=192bed16541fef20c11a2dd43cfcfddd")
    suspend fun fetchImages(@Query(value = "text") searchTerm: String): PhotosSearchResponse
}
