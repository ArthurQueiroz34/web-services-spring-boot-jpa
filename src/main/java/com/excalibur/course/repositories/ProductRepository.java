package com.excalibur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excalibur.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}