package ru.netology.coroutines.dto

data class CommentsWithAuthor(
	val comment: Comment,
	val author: List<Author>
)