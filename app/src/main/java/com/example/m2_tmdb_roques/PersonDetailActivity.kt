package com.example.m2_tmdb_roques

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m2_tmdb_roques.databinding.ActivityPersonDetailBinding

const val PERSON_ID_EXTRA_KEY = "person_id_ek"
class PersonDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityPersonDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityPersonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = intent.extras?.getString(PERSON_ID_EXTRA_KEY)


    }
}