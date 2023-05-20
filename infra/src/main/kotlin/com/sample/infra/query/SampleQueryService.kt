package com.sample.infra.query

import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import com.sample.usecase.query.BookDto
import com.sample.usecase.query.BookWithRentalDto
import com.sample.usecase.query.ISampleQueryService
import org.springframework.stereotype.Repository

//@Repository
//class SampleQueryService(
//    private val queryFactory: JPAQueryFactory
//) : ISampleQueryService {
////    val book =
//
//    override fun findBooksById(id: Int): BookDto {
//        queryFactory.select(
//            Projections.constructor(
//                BookDto::class.java,
//
//            )
////        ).from(QBookJpaEntity)
//
//    }
//
//    override fun findBookWithRentalById(id: Int): BookWithRentalDto {
//        TODO("Not yet implemented")
//    }
//}
