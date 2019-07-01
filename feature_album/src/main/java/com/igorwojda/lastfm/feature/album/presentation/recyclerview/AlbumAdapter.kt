package com.igorwojda.lastfm.feature.album.presentation.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.igorwojda.lastfm.feature.album.R
import com.igorwojda.lastfm.feature.album.domain.enum.AlbumDomainImageSize
import com.igorwojda.lastfm.feature.album.domain.model.AlbumDomainModel
import com.igorwojda.lastfm.feature.album.presentation.recyclerview.AlbumAdapter.MyViewHolder
import com.igorwojda.lastfm.feature.base.presentation.extension.setOnDebouncedClickListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_album_list_item.view.*
import kotlin.properties.Delegates

internal class AlbumAdapter(
    private val picasso: Picasso
) : RecyclerView.Adapter<MyViewHolder>() {
    var albums by Delegates.observable(listOf<AlbumDomainModel>()) { _, _, _ ->
        notifyDataSetChanged()
    }

    private var onDebouncedClickListener: ((album: AlbumDomainModel) -> Unit)? = null

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(albumDomainModel: AlbumDomainModel) {
            itemView.setOnDebouncedClickListener { onDebouncedClickListener?.invoke(albumDomainModel) }

            val url = albumDomainModel.images.firstOrNull { it.size == AlbumDomainImageSize.LARGE }?.url
            if (!albumDomainModel.images.isEmpty() && !url.isNullOrEmpty()) {
                loadImage(url)
            } else {
                itemView.imageView.setImageBitmap(null)
            }
        }

        private fun loadImage(it: String) {
            val imageSize = 400

            picasso.load(it)
                .resize(imageSize, imageSize)
                .centerCrop()
                .into(itemView.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_album_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(albums[position])
    }

    override fun getItemCount(): Int = albums.size

    fun setOnDebouncedClickListener(listener: (album: AlbumDomainModel) -> Unit) {
        this.onDebouncedClickListener = listener
    }
}
