package com.sample.domain.sampledomain

interface ISampleRepository {
    fun insert(sample: Sample): Sample
    fun findById(id: Int): String
}
