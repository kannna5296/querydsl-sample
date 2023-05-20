package com.sample.usecase.service

import com.sample.usecase.query.ISampleQueryService
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val bookQueryService: ISampleQueryService
) {

    fun findById(id: String) {
        bookQueryService.findBooksById(id)
    }

    fun findDetailById(id: String) {
        bookQueryService.findBookWithRentalById(id)
    }
}
