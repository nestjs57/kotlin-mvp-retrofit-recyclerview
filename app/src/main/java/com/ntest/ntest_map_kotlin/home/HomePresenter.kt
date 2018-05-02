package com.ntest.ntest_map_kotlin.home

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ntest.ntest_map_kotlin.model.Apis
import com.ntest.ntest_map_kotlin.model.*
import com.ntest.ntest_map_kotlin.model.Product
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList


class HomePresenter(view: HomeContract.homeView) : HomeContract.homePresenter {

    var view: HomeContract.homeView
    var baseURL: Apis
    var mData: ArrayList<Product>


    init {
        this.view = view
        baseURL = BaseURL.getBaseURL()
        mData = ArrayList()
    }

    override fun getAllFilms() {
        view.showLoading()
        baseURL.getProduct("8850124003850").enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                try {
                    mData = ArrayList()
                    mData = Gson().fromJson(response.body()!!.string(), object : TypeToken<List<Product>>() {
                    }.type)
                    view.hideLoading()
                    view.showAllFilms(mData)
                    view.onGetDataSuccess("", mData)
                } catch (e: Exception) {
                    view.hideLoading()
                }
            }
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {}
        })
    }

    override fun onFilmItemClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}