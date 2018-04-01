package com.biru.dev.khasdariid.ui.home

import android.provider.ContactsContract
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.biru.dev.khasdariid.R
import com.biru.dev.khasdariid.data.fake.model.Wisata
import com.biru.dev.khasdariid.di.component.ActivityComponent
import com.biru.dev.khasdariid.ui.placedetail.PlaceDetailActivity
import com.biru.dev.khasdariid.utils.BitmapUtils
import kotlinx.android.synthetic.main.item_populer.view.*

/**
 * Created by miftahun on 4/1/18.
 */
class WisataPopularAdapter(private val listWisata: MutableList<Wisata>) : RecyclerView.Adapter<WisataPopularAdapter.ViewHolder>() {

    override fun getItemCount() = this.listWisata.size


    internal fun addWisatassToList(wisatas: List<Wisata>) {
        this.listWisata.addAll(wisatas)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.let {
        it.clear()
        it.onBind(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_populer, parent, false))
    }

    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view){

        fun clear(){
            itemView.tv_item_name.text = ""
            itemView.rating_bar.rating = 0f
            itemView.iv_background.setImageDrawable(null)
        }

        fun onBind(position: Int){
            val (id,name,kota,photo,rating) = listWisata[position]

            inflateData(name,photo,rating)
            setItemClickListener(id)
        }

        private fun setItemClickListener(id:Int){
            itemView.setOnClickListener{
                it?.let {
                    var intent = PlaceDetailActivity.getIntent(itemView.context)
                    val p1: Pair<View, String> = Pair(itemView.iv_background,"transitionImage")
                    val p2: Pair<View, String> = Pair(itemView.tv_item_name,"transitionName")
                    val p3: Pair<View, String> = Pair(itemView.rating_bar,"transitionRating")
                    var options: ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                            itemView.context as AppCompatActivity,itemView.tv_item_name,"transitionName")
                    intent.putExtra("id",listWisata.get(id).id.toString())
                    itemView.context.startActivity(intent,options.toBundle())
                }
            }
        }

        private fun inflateData(name: String?, photo: List<Int>?, rating: Float){
            name?.let {
                itemView.tv_item_name.text = it
            }

            photo?.let {
                itemView.iv_background.setImageDrawable(itemView.context.resources.getDrawable(it.get(0),null))
            }

            rating.let {
                itemView.rating_bar.rating = it
            }
        }
    }
}