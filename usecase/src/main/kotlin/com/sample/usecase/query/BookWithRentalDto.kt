package com.sample.usecase.query

import java.time.LocalDateTime

data class BookWithRentalDto(
    val id: String,
    val title: String,
    val author: String,
    val rentals: List<RentalDto>
)

data class RentalDto(
    val userId: Int,
    val rentalDate: LocalDateTime,
)
