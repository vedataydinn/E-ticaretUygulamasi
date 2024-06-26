package com.vedat.e_commerce.util

import android.view.View
import androidx.fragment.app.Fragment
import com.vedat.e_commerce.R
import com.vedat.e_commerce.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.vedat.e_commerce.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.vedat.e_commerce.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}