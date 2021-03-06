package com.ntest.ntest_map_kotlin.model

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class BaseURL {


    // java must have static ... medthod name
    // but kotlin companion object { fun ... }
    companion object{
        fun getBaseURL(): Apis {
            var gson = GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create()
            var retrofit = Retrofit.Builder()
                    .baseUrl("http://droid4apps.com/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            return retrofit.create(Apis::class.java)
        }
    }


}