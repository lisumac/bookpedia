package org.lisa.bookpidea.book.presentaion.book_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.compose.viewmodel.koinViewModel
import org.lisa.bookpidea.book.Book


@Composable()
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit,
    modifier: Modifier = Modifier
) {

    val state by viewModel.state.collectAsStateWithLifecycle()
    BookListScreen(
        state = state,
        //viewModel::onAction
        onAction = {action->
            when(action){
                is BookListAction.OnBookClick -> onBookClick(action.book)
                else -> Unit

            }

        }

    )

}

@Composable()
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit,
    viewModel: BookListViewModel = koinViewModel()
) {

}
