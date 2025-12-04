package hoon.example.hoon_di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HoonDiApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}