package com.windrialfika.winewsmandiri.Modules.Main.UserInterface.Presenter

import com.windrialfika.winewsmandiri.Entity.Data.Response.MainResponse
import com.windrialfika.winewsmandiri.Modules.Main.UserInterface.View.MainViewInterface
import com.windrialfika.winewsmandiri.Support.Network.Repo.MainRepo
import com.windrialfika.winewsmandiri.Support.Network.Repo.MainRepoCallback

class MainPresenter (
    private val view: MainViewInterface,
    private val interactor: MainRepo
){
    fun getSources(apiKey: String) {
        view.hideView()
        interactor.getSources(apiKey, object : MainRepoCallback<MainResponse> {

            override fun onDataLoad(data: MainResponse) {
                view.responseSuccess(data)
            }

            override fun onError(error: Throwable) {
                view.onError(error)
            }

        })
        view.showView()
    }
}