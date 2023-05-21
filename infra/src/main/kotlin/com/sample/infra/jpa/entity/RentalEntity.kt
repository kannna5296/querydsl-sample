package com.sample.infra.jpa.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "rental")
class RentalEntity(
    @Id
    var id: String? = null,
    val userId: Int? = null,
    val rentalDate: LocalDateTime? = null,
    val returnDeadline: LocalDateTime? = null,
)
