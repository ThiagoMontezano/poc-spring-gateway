package com.montezano.customer.repositories

import com.montezano.customer.entities.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<Customer, String> {

}