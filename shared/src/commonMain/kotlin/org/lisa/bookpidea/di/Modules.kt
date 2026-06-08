package org.lisa.bookpidea.di

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import org.lisa.bookpidea.book.presentaion.book_list.BookListViewModel

expect val platformModule: Module

val sharedModule = module {
    viewModelOf(::BookListViewModel)
}

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(sharedModule, platformModule)
    }
}
