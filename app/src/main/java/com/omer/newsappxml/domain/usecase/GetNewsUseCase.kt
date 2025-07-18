package com.omer.newsappxml.domain.usecase

import com.omer.newsappxml.domain.repository.NewsRepository
import com.omer.newsappxml.domain.model.News
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(
    private val repo : NewsRepository
) {
    suspend operator fun invoke(country:String, category:String, fromInternet: Boolean = false): List<News> {
        return repo.getNews(country, category, fromInternet)
    }
}