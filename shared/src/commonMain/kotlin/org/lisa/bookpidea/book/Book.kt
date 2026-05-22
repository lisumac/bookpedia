package org.lisa.bookpidea.book

data class Book(
    val id: String,
    val title: String,
    val imageUrl: String,
    val authors: String,
    val descriptions: String,
    val languages: List<String>,
    val firstPublishYear: String?,
    val averageRatings: Double?,
    val ratingCount: Int?,
    val numPages: Int?,
    val numEditions: Int
)
