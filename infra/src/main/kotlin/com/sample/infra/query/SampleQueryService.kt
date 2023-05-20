 
package com.sample.infra.query

import com.querydsl.jpa.impl.JPAQueryFactory
import com.sample.usecase.query.BookDto
import com.sample.usecase.query.BookWithRentalDto
import com.sample.usecase.query.ISampleQueryService
import org.springframework.stereotype.Repository

@Repository
class SampleQueryService(
    private val queryFactory: JPAQueryFactory // TODO こいつの設定
) : ISampleQueryService {
//    val book = com.sample.infra.jpa.entity

    override fun findBooksById(id: String): BookDto {
        TODO("Not yet implemented")
    }

    override fun findBookWithRentalById(id: String): BookWithRentalDto {
        TODO("Not yet implemented")
    }
}
