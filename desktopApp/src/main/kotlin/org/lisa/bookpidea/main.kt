package org.lisa.bookpidea

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.lisa.bookpidea.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "bookpidea",
        ) {
            App()
        }
    }
}