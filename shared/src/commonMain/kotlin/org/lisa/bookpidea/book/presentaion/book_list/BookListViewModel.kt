package org.lisa.bookpidea.book.presentaion.book_list

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import coil3.decode.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import org.lisa.bookpidea.book.domain.BookRepository

class BookListViewModel(private  val dataSource: BookRepository) : ViewModel() {

    private val _state = MutableStateFlow(BookListState())
     val state = _state.asStateFlow()

    fun onAction(action: BookListAction) {
        when (action) {

            is BookListAction.OnBookClick -> {


            }

            is BookListAction.OnSearchQueryChange -> {
                _state.update {
                    it.copy(searchQuery = action.query)
                }

            }

            is BookListAction.OnTabSelected -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index)
                }

            }

        }
    }
}


