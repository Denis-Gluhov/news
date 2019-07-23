package ru.home.app_news.presentations.main

import android.os.Bundle
import ru.home.app_news.R
import ru.home.app_news.presentations.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupComponent() {

    }
}