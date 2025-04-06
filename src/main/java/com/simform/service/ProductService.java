package com.simform.service;

import com.simform.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    List<Product> productList = List.of(
            new Product(1, "Laptop", 50000),
            new Product(2, "Mobile", 25000),
            new Product(3, "Table", 1000)
    );

    public List<Product> getAll() {
        return productList;
    }

    public Product getById(int id) {
        return productList
                .stream().filter(p -> p.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Product not found with id :" + id));

    }


}
