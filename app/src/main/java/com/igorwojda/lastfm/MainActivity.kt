package com.igorwojda.lastfm

import android.content.Intent
import android.os.Bundle
import com.igorwojda.lastfm.feature.album.presentation.AlbumListActivity
import com.igorwojda.lastfm.feature.artist.presentation.ArtistListActivity
import com.igorwojda.lastfm.feature.base.presentation.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override val layoutResourceId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launchFeatureAlbumButton.setOnClickListener {
            Intent(this, AlbumListActivity::class.java).also { intent ->
                startActivity(intent)
            }
        }
        launchFeatureArtistButton.setOnClickListener {
            Intent(this, ArtistListActivity::class.java).also { intent ->
                startActivity(intent)
            }
        }
    }
}
