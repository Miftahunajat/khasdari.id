package com.biru.dev.khasdariid.ui.home;

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.data.fake.model.OlehOleh
import kotlinx.android.synthetic.main.item_populer.view.*

/**
 * Created by miftahun on 4/1/18.
 */
class OlehOlehAdapter(private val listOlehOleh: MutableList<OlehOleh>) : RecyclerView.Adapter<OlehOlehAdapter.OlehOlehVH>() {

    override fun getItemCount() = this.listOlehOleh.size

    internal fun addOlehOlehsToList(OlehOlehs: List<OlehOleh>) {
        this.listOlehOleh.addAll(OlehOlehs)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: OlehOlehVH, position: Int) = holder.let {
        it.clear()
        it.onBind(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): OlehOlehVH {
        return OlehOlehVH(LayoutInflater.from(parent?.context).inflate(R.layout.item_populer, parent, false))
    }

    inner class OlehOlehVH(view: View) : RecyclerView.ViewHolder(view) {

        fun clear() {
        }

        fun onBind(position: Int) {
            val (id, name, kota,wisata, photo, rating) = listOlehOleh[position]

            inflateData(name, photo, rating)
            setItemClickListerner(id)
        }

        private fun setItemClickListerner(id: Int) {
            itemView.setOnClickListener {
                it?.let {

                }
            }
        }

        private fun inflateData(name: String?, photo: List<Int>?, rating: Float) {
            name?.let {
                itemView.tv_item_name.text = it
            }

            photo?.let {
                //                itemView.iv_background.setImageDrawable(itemView.context.resources.getDrawable(it.get(0),null))
            }

            rating?.let {
                itemView.rating_bar.rating = it
            }
        }
    }
}