package com.example.m2_tmdb_roques.model

import com.google.gson.annotations.SerializedName


data class KnownFor (

  @SerializedName("backdrop_path"     ) var backdropPath     : String?           = null,
  @SerializedName("first_air_date"    ) var firstAirDate     : String?           = null,
  @SerializedName("genre_ids"         ) var genreIds         : ArrayList<Int>    = arrayListOf(),
  @SerializedName("id"                ) var id               : Int?              = null,
  @SerializedName("media_type"        ) var mediaType        : String?           = null,
  @SerializedName("name"              ) var name             : String?           = null,
  @SerializedName("origin_country"    ) var originCountry    : ArrayList<String> = arrayListOf(),
  @SerializedName("original_language" ) var originalLanguage : String?           = null,
  @SerializedName("original_name"     ) var originalName     : String?           = null,
  @SerializedName("overview"          ) var overview         : String?           = null,
  @SerializedName("poster_path"       ) var posterPath       : String?           = null,
  @SerializedName("vote_average"      ) var voteAverage      : Double?           = null,
  @SerializedName("vote_count"        ) var voteCount        : Int?              = null

)