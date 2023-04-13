package com.example.m2_tmdb_roques

import androidx.lifecycle.ViewModel
import com.example.m2_tmdb_roques.db.SocialBarDao

class SocialBarViewModel(private val socialBarDao: SocialBarDao) : ViewModel() {
    var nbLikes = socialBarDao.getAllLikes()
    var isFavorite = socialBarDao.getAllFavorites()
}