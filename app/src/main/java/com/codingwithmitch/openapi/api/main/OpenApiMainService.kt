package com.codingwithmitch.openapi.api.main

import androidx.lifecycle.LiveData
import com.codingwithmitch.openapi.api.GenericApiResponse
import com.codingwithmitch.openapi.api.GenericResponse
import com.codingwithmitch.openapi.models.AccountProperties
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface OpenApiMainService {


    @GET("account/properties")
    fun getAccountProperties(
        @Header("Authorization") authorization: String
    ): LiveData<GenericApiResponse<AccountProperties>>

    @PUT("account/properties/update")
    @FormUrlEncoded
    fun saveAccountProperties(
        @Header("Authorization") authorization: String,
        @Field("email") email: String,
        @Field("username") username: String
    ): LiveData<GenericApiResponse<GenericResponse>>

}















