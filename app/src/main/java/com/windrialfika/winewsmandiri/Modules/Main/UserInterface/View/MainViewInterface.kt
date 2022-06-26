package com.windrialfika.winewsmandiri.Modules.Main.UserInterface.View

import com.windrialfika.winewsmandiri.Entity.Data.Response.MainResponse

interface MainViewInterface {
    fun hideView()
    fun showView()
    fun responseSuccess(data: MainResponse)
    fun onError(error: Throwable)
   // fun showData(data: SourcesResponse)
}