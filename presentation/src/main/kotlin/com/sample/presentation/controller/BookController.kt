package com.sample.presentation.controller

import com.sample.usecase.request.SampleForm
import com.sample.usecase.response.BookDetailResponse
import com.sample.usecase.response.BookResponse
import com.sample.usecase.response.SampleResponse
import com.sample.usecase.service.SampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(
    private val sampleService: SampleService
) {

    @PostMapping("/sample")
    fun create(@RequestBody param: SampleForm): ResponseEntity<SampleResponse> {
        return ResponseEntity.ok(null)
    }

    @GetMapping("/book/{id}")
    fun index(@PathVariable id: String): ResponseEntity<BookResponse> {
        val result = sampleService.findById(id)
        val response = BookResponse(result)
        return ResponseEntity.ok(response)
    }

    @GetMapping("/book/{id}/detail")
    fun indexDetail(@PathVariable id: String): ResponseEntity<BookDetailResponse> {
        val result = sampleService.findDetailById(id)
        val response = BookDetailResponse(result)
        return ResponseEntity.ok(response)
    }
}
