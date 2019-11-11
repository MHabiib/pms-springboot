package com.future.pms.repository;

import com.future.pms.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByEmail(String email);
}
