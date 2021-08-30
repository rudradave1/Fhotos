package com.rudra.imagesearchapp.api

import com.rudra.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
)