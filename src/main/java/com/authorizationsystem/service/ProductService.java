package com.authorizationsystem.service;

import com.authorizationsystem.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    List<Product> getAllProducts();

}
