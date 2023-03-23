package com.example.m2_tmdb_roques

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.io.IOException

class TmdbDailyWorker (context: Context, params: WorkerParameters) : Worker(context, params) {
    private val LOGTAG = TmdbDailyWorker::class.java.simpleName
    override fun doWork(): Result {
        Log.d(LOGTAG, "doWork()")
        val tmdbapi = ApiClient.instance.create(ITmdbApi::class.java)
        val call = tmdbapi.getPopularPerson(TMDB_API_KEY, 1)
        try {
            val response = call.execute()
            TmdbNotifications.createPopularPersonNotification(applicationContext, response.body()?.results!![0])
            return Result.success()
        } catch (e : IOException) {
            Log.e(LOGTAG,"Call to getPopularPerson failed with ${e.message}")
            return Result.failure()
        }
    }
}