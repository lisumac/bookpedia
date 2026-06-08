package org.lisa.bookpidea

import androidx.compose.ui.window.ComposeUIViewController
import org.lisa.bookpidea.di.initKoin

fun MainViewController() = ComposeUIViewController {
    App()
}

fun initKoin() {
    initKoin(config = null)
}
