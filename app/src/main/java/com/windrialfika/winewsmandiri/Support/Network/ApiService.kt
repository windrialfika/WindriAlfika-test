package com.windrialfika.winewsmandiri.Support.Network

import com.windrialfika.winewsmandiri.Entity.Data.Response.MainResponse
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable

interface ApiService {
    @GET("v2/sources")
    fun getSources(@Query("apiKey") apiKey: String): Observable<MainResponse>

  //  @GET("v2/top-headlines")
  //  fun getArticles(@Query("sources") sources: String, @Query("apiKey") apiKey: String): Observable<ArticlesResponse>

   // @GET("v2/everything")
    //fun getSearchArticles(@Query("q") search: String, @Query("apiKey") apiKey: String): Observable<ArticlesResponse>
}