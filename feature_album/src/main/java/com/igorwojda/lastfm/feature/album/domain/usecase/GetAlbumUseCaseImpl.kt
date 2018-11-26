package com.igorwojda.lastfm.feature.album.domain.usecase

import com.igorwojda.lastfm.feature.album.domain.model.AlbumDomainModel
import com.igorwojda.lastfm.feature.album.domain.repository.AlbumRepository

internal interface GetAlbumUseCase {
    suspend fun execute(
        artistName: String,
        albumName: String,
        mbId: String?
    ): AlbumDomainModel?
}

internal class GetAlbumUseCaseImpl(
    private val albumRepository: AlbumRepository
) : GetAlbumUseCase {
    override suspend fun execute(
        artistName: String,
        albumName: String,
        mbId: String?
    ): AlbumDomainModel? =
        albumRepository.getAlbumInfo(artistName, albumName, mbId)
}
