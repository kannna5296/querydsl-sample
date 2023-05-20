package com.sample.presentation.controller

import com.sample.usecase.request.SampleForm
import com.sample.usecase.response.SampleResponse
import com.sample.usecase.service.SampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) {

    @PostMapping("/sample")
    fun create(@RequestBody param: SampleForm): ResponseEntity<SampleResponse> {
        return ResponseEntity.ok(null)
    }

    @GetMapping("/book")
    fun create(@RequestParam id: String): ResponseEntity<SampleResponse> {
        val result = sampleService.findById(id)
        return ResponseEntity.ok(null)
    }
}
