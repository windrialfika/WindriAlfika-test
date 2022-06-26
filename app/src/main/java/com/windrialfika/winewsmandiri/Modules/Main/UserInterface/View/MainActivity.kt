package com.windrialfika.winewsmandiri.Modules.Main.UserInterface.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.windrialfika.winewsmandiri.BuildConfig
import com.windrialfika.winewsmandiri.Entity.Data.Response.MainResponse
import com.windrialfika.winewsmandiri.Modules.Main.UserInterface.Presenter.MainPresenter
import com.windrialfika.winewsmandiri.R
import com.windrialfika.winewsmandiri.Support.Network.Repo.MainRepo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainViewInterface {
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavListener()
        getNews()
    }

    private fun initNavListener(){
        navView.setNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.home->{
                    //action
                }
                R.id.profile->{
                    //action
                  //  mainContent.onSettingsClick()
                }
            }
            mainDrawerLayout.closeDrawers()
            true
        }
    }

    private fun getNews(){
       presenter = MainPresenter(this, MainRepo())
       presenter.getSources(BuildConfig.API_KEY)
    }

    override fun hideView() {
       // TODO("Not yet implemented")
    }

    override fun responseSuccess(data: MainResponse) {
        //TODO("Not yet implemented")
    }

    override fun showView() {
       // TODO("Not yet implemented")
    }

    override fun onError(error: Throwable) {
       // TODO("Not yet implemented")
    }


}


