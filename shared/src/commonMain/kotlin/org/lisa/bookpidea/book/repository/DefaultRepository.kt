package org.lisa.bookpidea.book.repository

import androidx.room.Query
import com.plcoding.bookpedia.core.domain.EmptyResult
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map
import kotlinx.coroutines.flow.Flow
import org.lisa.bookpidea.book.domain.Book
import org.lisa.bookpidea.book.domain.BookRepository
import org.lisa.bookpidea.book.mappers.toBook
import org.lisa.bookpidea.book.network.RemoteBookDataSource
import org.lisa.bookpidea.core.domain.DataError

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,

): BookRepository {
    //Result<List<Book>, DataError.Remote>
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }

    override suspend fun getBookDescription(bookId: String): com.plcoding.bookpedia.core.domain.Result<String?, DataError> {
        TODO("Not yet implemented")
    }

    override fun getFavoriteBooks(): Flow<List<Book>> {
        TODO("Not yet implemented")
    }

    override fun isBookFavorite(id: String): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFromFavorites(id: String) {
        TODO("Not yet implemented")
    }
}