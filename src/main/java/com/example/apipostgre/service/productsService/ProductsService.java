package com.example.apipostgre.service.productsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apipostgre.entity.models.products.ProductsEntity;
import com.example.apipostgre.repository.product.ProductsRepository;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository _productsRepository;

    public List<ProductsEntity> getAllproducts() {
        return this._productsRepository.findAll();
    }
}
