package org.tim.inventoryservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.tim.inventoryservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product,String> {
}