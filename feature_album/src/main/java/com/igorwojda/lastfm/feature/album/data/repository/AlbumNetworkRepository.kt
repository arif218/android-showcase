package com.igorwojda.lastfm.feature.album.data.repository

import awaitObjectResponse
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.gson.gsonDeserializerOf
import com.github.kittinunf.result.getOrElse
import com.igorwojda.lastfm.feature.album.data.model.AlbumNetworkModel
import com.igorwojda.lastfm.feature.album.data.model.toDomainModel
import com.igorwojda.lastfm.feature.album.domain.model.AlbumDomainModel

class AlbumNetworkRepository : AlbumRepository {
    override suspend fun getAlbumList(): List<AlbumDomainModel> {
        val (_, _, result) = Fuel.get("/albums").awaitObjectResponse<List<AlbumNetworkModel>>(
            gsonDeserializerOf()
        )

        var albums = result.getOrElse(listOf())
        return albums.map { it.toDomainModel() }
    }

    override suspend fun getAlbum(id: Int): AlbumDomainModel? {
        val (_, _, result) = Fuel.get("/albums/$id").awaitObjectResponse<AlbumNetworkModel>(
            gsonDeserializerOf()
        )

        var album: AlbumNetworkModel? = null
        result.fold(success = { album = it }, failure = {})

        return album?.toDomainModel()
    }
}
