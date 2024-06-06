package com.example.entregafinal

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rvMusics)

        val musicList = listOf(
            MusicModel("Last Nite", "The Strokes", R.drawable.is_thit_it_cover),
            MusicModel("A Certain Romance", "Arctic Monkeys", R.drawable.wpsiatwin),
            MusicModel("Jigsaw Falling Into Place", "Radiohead", R.drawable.inrainbows)
        )

        val musicAdapter = MusicRecyclerAdapter(this, musicList) {
            goToAjuste()
        }

        val musicLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.apply {
            adapter = musicAdapter
            layoutManager = musicLayoutManager
        }

    }

    private fun goToAjuste() {
        val intent = Intent(this, AjusteActivity::class.java)
        startActivity(intent)
    }
}