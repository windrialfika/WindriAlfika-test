package com.windrialfika.winewsmandiri.Support.Network.Repo

import com.windrialfika.winewsmandiri.Entity.Data.Response.MainResponse
import com.windrialfika.winewsmandiri.Support.Network.ApiService
import com.windrialfika.winewsmandiri.Support.Network.RetrofitService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainRepo {
    fun getSources(apiKey: String, callback: MainRepoCallback<MainResponse>) {
//        RetrofitService.createService(ApiService::class.java)
//            .getSources(apiKey)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({ R ->
//                callback.onDataLoad(data)
//            }, { error ->
//                callback.onError(error)
//            })
    }
}