package com.authorizationsystem.controller;

import com.authorizationsystem.entity.Product;
import com.authorizationsystem.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@Log4j2

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        log.info("creating new product by admin");
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        log.info("getting list of all products");
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
}
