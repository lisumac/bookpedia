package org.lisa.bookpidea.book.presentaion.book_list

import com.plcoding.bookpedia.core.presentation.UiText
import org.lisa.bookpidea.book.Book



data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)