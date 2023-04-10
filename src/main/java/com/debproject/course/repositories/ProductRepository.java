package com.debproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
