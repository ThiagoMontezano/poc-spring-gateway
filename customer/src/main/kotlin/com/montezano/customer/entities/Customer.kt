package com.montezano.customer.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "customers")
data class Customer (@Id val id: String,
                     var name: String,
                     var email: String,
                     var createdAt: LocalDate)