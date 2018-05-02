package com.ntest.ntest_map_kotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Product(

        @SerializedName("product_id")
        @Expose
        var product_id: String,

        @SerializedName("barcode")
        @Expose
        var barcode: String,

        @SerializedName("name")
        @Expose
        var name: String,

        @SerializedName("detail")
        @Expose
        var detail: String,

        @SerializedName("price")
        @Expose
        var price: String,

        @SerializedName("product_img")
        @Expose
        var img: String
) {
}