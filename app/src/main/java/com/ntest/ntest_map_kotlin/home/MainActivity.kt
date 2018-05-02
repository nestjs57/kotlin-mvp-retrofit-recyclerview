package com.ntest.ntest_map_kotlin.home

import android.app.Activity
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ntest.ntest_map_kotlin.R
import com.ntest.ntest_map_kotlin.model.Product
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() , HomeContract.homeView{



    lateinit var adapter: ProductAdapter
    lateinit var presenter: HomeContract.homePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = HomePresenter(this)
        presenter.getAllFilms()
        rvFilms.setLayoutManager(LinearLayoutManager(this))

    }


    override fun showLoading() {
        srl.setRefreshing(true)    }

    override fun hideLoading() {
        srl.setRefreshing(false)
    }

    override fun showTitle(title: String) {
    }

    override fun showMessage(message: String) {
    }

    override fun showAllFilms(Product: List<Product>) {
    }

    override fun navigateToFilmPage() {
    }

    override fun onGetDataSuccess(message: String, list: ArrayList<Product>) {
        adapter = ProductAdapter(list)
        rvFilms.setAdapter(adapter)    }




}
