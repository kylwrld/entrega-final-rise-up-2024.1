package com.example.entregafinal

data class MusicModel(
    val title: String,
    val artist: String,
    val image: Int,
) {
    override fun toString(): String {
        return title
    }
}