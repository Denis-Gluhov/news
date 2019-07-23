package ru.home.app_news.presentations.main

import dagger.Module

@Module
class MainModule(
    view: MainView
) {

    fun providePresenter(): MainPresenter {
        return MainPresenter()
    }

}