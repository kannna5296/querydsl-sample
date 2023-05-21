package com.sample.usecase.response

import com.sample.usecase.query.BookWithRentalDto
import java.time.LocalDateTime

class BookDetailResponse(
    val id: String,
    val title: String,
    val author: String,
    val rentals: List<RentalResponse>
) {
    constructor(bookDetailDto: BookWithRentalDto) : this (
        id = bookDetailDto.id,
        title = bookDetailDto.title,
        author = bookDetailDto.author,
        rentals = bookDetailDto.rentals.map {
            RentalResponse(it.userId, it.rentalDate)
        }
    )
}

class RentalResponse(
    val userId: Int,
    val rentalDate: LocalDateTime,
)
