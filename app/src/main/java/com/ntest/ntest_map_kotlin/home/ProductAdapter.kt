package com.ntest.ntest_map_kotlin.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ntest.ntest_map_kotlin.R
import com.ntest.ntest_map_kotlin.model.Product
import java.util.ArrayList

class ProductAdapter (var mData : ArrayList<Product>): RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent?.getContext()).inflate(R.layout.item_film, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder?, position: Int) {
        var userDto  = mData[position]
        holder?.tvTitle?.text = userDto.name
    }
}