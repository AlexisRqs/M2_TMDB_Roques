package com.example.m2_tmdb_roques

import androidx.lifecycle.ViewModel

class SocialBarViewModel : ViewModel() {
    var nbLikes = mutableMapOf<Int, Int>()
    var isFavorite = mutableMapOf<Int, Boolean>()
}