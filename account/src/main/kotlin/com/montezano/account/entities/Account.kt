package com.montezano.account.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.util.*

@Document(collection = "accounts")
data class Account (@Id val id: String = UUID.randomUUID().toString(),
                    var accountNumber: String = id,
                    var agencyNumber: String,
                    var customerId: String,
                    var balanceAmount: Double,
                    var transactionLimit: Double,
                    var active: Boolean = false,
                    var createdAt: LocalDate)
