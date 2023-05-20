package com.sample.usecase.query

interface ISampleQueryService {
    fun findBooksById(id: String): BookDto
    fun findBookWithRentalById(id: String): BookWithRentalDto
}
