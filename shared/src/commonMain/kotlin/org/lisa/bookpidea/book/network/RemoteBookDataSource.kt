package org.lisa.bookpidea.book.network

import com.plcoding.bookpedia.core.domain.Result
import org.lisa.bookpidea.book.data.dto.SearchResponseDto
import org.lisa.bookpidea.core.domain.DataError

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

   // suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}