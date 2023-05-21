
package com.sample.infra.query

import com.querydsl.core.group.GroupBy.groupBy
import com.querydsl.core.group.GroupBy.list
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import com.sample.infra.jpa.entity.QBookEntity
import com.sample.infra.jpa.entity.QRentalEntity
import com.sample.usecase.query.BookDto
import com.sample.usecase.query.BookWithRentalDto
import com.sample.usecase.query.ISampleQueryService
import com.sample.usecase.query.RentalDto
import org.springframework.stereotype.Repository

@Repository
class SampleQueryService(
    private val queryFactory: JPAQueryFactory // TODO こいつの設定
) : ISampleQueryService {
    private val book = QBookEntity.bookEntity // build/generated/source/kapt/main/.../infra.jpa.entityに自動生成される
    private val rental = QRentalEntity.rentalEntity // build/generated/source/kapt/main/.../infra.jpa.entityに自動生成される

    override fun findBooksById(id: String): BookDto? {
        val result = queryFactory.select(
            Projections.constructor(
                BookDto::class.java,
                book.id,
                book.author,
                book.title,
            )
        ).from(book).where(book.id.eq(id)).fetchOne()
        println(result) // 簡易ログ
        return result
    }

    override fun findBookWithRentalById(id: String): BookWithRentalDto? {
        val result = queryFactory
            .from(book)
            .leftJoin(book.rentals, rental)
            .where(book.id.eq(id))
            .transform(groupBy(book.id).`as`(
                Projections.constructor(
                    BookWithRentalDto::class.java,
                    book.id,
                    book.title,
                    book.author,
                    list(Projections.constructor(
                        RentalDto::class.java,
                        rental.userId,
                        rental.rentalDate
                    ))
                )
            ))
        val bookWithRental = result[id]
        println(bookWithRental) // 簡易ログ
        return bookWithRental
    }
}
