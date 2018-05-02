package com.ntest.ntest_map_kotlin.home

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.ntest.ntest_map_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*


class ProductViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var tvTitle: TextView? = null

    init {
        this.tvTitle = itemView?.findViewById<TextView>(R.id.tvTitle)
    }


}