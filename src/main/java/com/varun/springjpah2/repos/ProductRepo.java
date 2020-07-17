package com.varun.springjpah2.repos;

import com.varun.springjpah2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
