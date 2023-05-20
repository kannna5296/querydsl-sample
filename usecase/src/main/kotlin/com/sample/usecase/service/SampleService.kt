package com.sample.usecase.service

import com.sample.domain.sampledomain.ISampleRepository
import com.sample.domain.sampledomain.Name
import com.sample.domain.sampledomain.Sample
import com.sample.usecase.query.ISampleQueryService
import com.sample.usecase.request.SampleForm
import com.sample.usecase.response.SampleResponse
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val bookQueryService: ISampleQueryService
) {

    fun findById(id : String) {
        bookQueryService.findBooksById(id)

    }

    fun findDetailById(id : String) {
        bookQueryService.findBookWithRentalById(id)
    }
}
