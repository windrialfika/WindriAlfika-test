package com.windrialfika.winewsmandiri.Modules.Main.UserInterface.View.Navigation

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.terrakok.cicerone.commands.Replace


class DrawerNavigation (
    activity : FragmentActivity,
    fragmentManager: FragmentManager,
    containerId : Int
): SupportAppNavigator(activity, fragmentManager, containerId){

}