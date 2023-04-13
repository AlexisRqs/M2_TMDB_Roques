package com.example.m2_tmdb_roques

import android.app.Application
import com.example.m2_tmdb_roques.db.TmdbDatabase

class TmdbApplication : Application() {
    val database by lazy { TmdbDatabase.getDatabase(this) }
    val socialBarDao by lazy {database.socialBarDao()}
}