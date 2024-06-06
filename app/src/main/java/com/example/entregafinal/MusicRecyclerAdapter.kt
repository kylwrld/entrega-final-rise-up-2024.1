package com.example.entregafinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicRecyclerAdapter(
    private val context: Context,
    private val list: List<MusicModel>,
    private val onClickListener: (MusicModel) -> Unit,
) : RecyclerView.Adapter<MusicViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.it_music_list, parent, false)
        return MusicViewHolder(view, list, onClickListener)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(position)
    }
}
