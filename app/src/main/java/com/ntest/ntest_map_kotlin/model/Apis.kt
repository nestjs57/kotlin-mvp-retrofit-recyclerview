package com.ntest.ntest_map_kotlin.model

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface Apis {
    @GET("AllProduct.php")
    fun getProduct(@Query("product_barcode") product_barcode: String): Call<ResponseBody>
}