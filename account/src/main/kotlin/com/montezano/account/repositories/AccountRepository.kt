package com.montezano.account.repositories

import com.montezano.account.entities.Account
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : MongoRepository<Account, String> {

    @RestResource(path = "byCustomer", rel = "customFindMethod")
    fun findByCustomerId(@Param("id") customerId: String) : Account

}