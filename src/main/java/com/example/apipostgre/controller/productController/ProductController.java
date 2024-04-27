package com.example.apipostgre.controller.productController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apipostgre.service.productsService.ProductsService;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductsService _productsService;

    public ResponseEntity getAllproducts(){
        return ResponseEntity.status(200).body(this._productsService.getAllproducts());
    }
}
