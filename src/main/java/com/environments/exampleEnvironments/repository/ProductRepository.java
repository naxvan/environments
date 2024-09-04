package com.environments.exampleEnvironments.repository;

import com.environments.exampleEnvironments.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
