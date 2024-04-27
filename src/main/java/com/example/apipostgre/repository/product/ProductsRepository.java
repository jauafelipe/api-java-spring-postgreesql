package com.example.apipostgre.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apipostgre.entity.models.products.ProductsEntity;

public interface ProductsRepository extends JpaRepository<ProductsEntity, Long>{
    
}
