package com.example.apipostgre.entity.models.products;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long product_id;
    @Column(name = "product_name", length = 50, nullable = false)
    private String product_name;
    @Column(name = "quantidade")
    private Long quantity;
}
