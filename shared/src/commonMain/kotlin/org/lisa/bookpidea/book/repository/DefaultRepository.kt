package org.lisa.bookpidea.book.repository

import androidx.room.Query
import com.plcoding.bookpedia.core.domain.map
import org.lisa.bookpidea.book.Book
import org.lisa.bookpidea.book.mappers.toBook
import org.lisa.bookpidea.book.network.RemoteBookDataSource
import org.lisa.bookpidea.core.domain.DataError

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,

){
    //Result<List<Book>, DataError.Remote>
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }