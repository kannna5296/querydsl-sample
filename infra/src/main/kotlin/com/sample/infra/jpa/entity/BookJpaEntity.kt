package com.sample.infra.jpa.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "book")
class BookJpaEntity(
    @Id
    var id: String? = null,
    val title: String? = null,
    val author: String? = null,
    val releaseDate: LocalDateTime? = null,
    @OneToMany
    val rentals: Set<RentalJpaEntity>? = null,
)
