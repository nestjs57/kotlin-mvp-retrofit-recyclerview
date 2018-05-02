package com.ntest.ntest_map_kotlin.home

import com.ntest.ntest_map_kotlin.model.Product
import java.util.ArrayList

interface HomeContract {

    interface homeView {

        fun showLoading()

        fun hideLoading()

        fun showTitle(title: String)

        fun showMessage(message: String)

        fun showAllFilms(Product: List<Product>)

        fun navigateToFilmPage()

        fun onGetDataSuccess(message: String, list: ArrayList<Product>)

    }

    interface homePresenter {

        fun getAllFilms()

        fun onFilmItemClicked()
    }

}