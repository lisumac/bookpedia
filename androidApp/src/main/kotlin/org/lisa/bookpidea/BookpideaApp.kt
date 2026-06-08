package org.lisa.bookpidea

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.lisa.bookpidea.di.initKoin

class BookpideaApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookpideaApp)
        }
    }
}
