package com.sample.usecase.service

import com.sample.usecase.query.BookDto
import com.sample.usecase.query.BookWithRentalDto
import com.sample.usecase.query.ISampleQueryService
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val bookQueryService: ISampleQueryService
) {

    fun findById(id: String): BookDto {
        return bookQueryService.findBooksById(id) ?: throw Exception("書籍情報がありません")
    }

    fun findDetailById(id: String): BookWithRentalDto {
        return bookQueryService.findBookWithRentalById(id) ?: throw Exception("書籍レンタル情報がありません")
    }
}
