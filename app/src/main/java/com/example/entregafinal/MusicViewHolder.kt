package com.example.entregafinal

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicViewHolder(view: View, val list: List<MusicModel>, val onClickListener: (MusicModel) -> Unit): RecyclerView.ViewHolder(view) {
    // Acessar as variáveis a partir dos IDs
    val title: TextView = view.findViewById(R.id.tvMusicTitle)
    val artist: TextView = view.findViewById(R.id.tvArtist)
    val image: ImageView = view.findViewById(R.id.ivMusicImage)


    fun bind(position: Int) {
        val music = list[position]

        image.setImageResource(music.image)
        title.text = music.title
        artist.text = music.artist

        itemView.setOnClickListener {
            onClickListener(music)
        }
    }
}