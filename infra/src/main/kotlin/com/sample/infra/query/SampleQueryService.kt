 
package com.sample.infra.query

import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import com.sample.infra.jpa.entity.QBookEntity

import com.sample.usecase.query.BookDto
import com.sample.usecase.query.BookWithRentalDto
import com.sample.usecase.query.ISampleQueryService
import org.springframework.stereotype.Repository

@Repository
class SampleQueryService(
    private val queryFactory: JPAQueryFactory // TODO こいつの設定
) : ISampleQueryService {
    private val book = QBookEntity.bookEntity //build/generated/source/kapt/main/.../infra.jpa.entityに自動生成される


    override fun findBooksById(id: String): BookDto? {
        val result = queryFactory.select(
            Projections.constructor(
                BookDto::class.java,
                book.id,
                book.author,
                book.author,
            )).from(book).fetchOne()
        println(result) //簡易ログ
        return result
    }

    override fun findBookWithRentalById(id: String): BookWithRentalDto {
        TODO("Not yet implemented")
    }
}
