package com.rudra.fhotos.api

import com.rudra.fhotos.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
)