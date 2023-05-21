package com.sample.usecase.response

import com.sample.usecase.query.BookDto

class BookResponse(
    val id: String,
    val title: String,
    val author: String,
) {
    constructor(bookDto: BookDto) : this (
        id = bookDto.id,
        title = bookDto.title,
        author = bookDto.author,
    )
}
