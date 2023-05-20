package com.sample.usecase.query

import java.time.LocalDateTime

class BookWithRentalDto(
    val id: String,
    val title: String,
    val author: String,
    val rentals: List<Rental>
)

class Rental(
    val userId: String,
    val rentalDate: LocalDateTime,
)
