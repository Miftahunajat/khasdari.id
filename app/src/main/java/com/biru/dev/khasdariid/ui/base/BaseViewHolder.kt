package com.biru.dev.khasdariid.ui.base

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by miftahun on 3/30/18.
 */

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var currentPosition: Int = 0
        private set

    protected abstract fun clear()

    fun onBind(position: Int) {
        currentPosition = position
        clear()
    }
}