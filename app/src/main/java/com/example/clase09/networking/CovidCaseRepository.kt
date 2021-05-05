package com.example.clase08.networking

import com.example.clase08.model.CovidCaseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CovidCaseRepository {

    @GET("countries?yesterday")
    fun getCountriesCovidCases(): Call<List<CovidCaseModel>>
}