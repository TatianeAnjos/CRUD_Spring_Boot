package com.tatiane.CRUD.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatiane.CRUD.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
