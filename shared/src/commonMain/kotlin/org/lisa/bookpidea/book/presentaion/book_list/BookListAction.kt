package org.lisa.bookpidea.book.presentaion.book_list

import androidx.room.Query
import org.lisa.bookpidea.book.Book

/**
 *
 */
sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String):
       BookListAction
    data class OnBookClick(val book: Book):
       BookListAction
    data class OnTabSelected(val index: Int):
       BookListAction

}