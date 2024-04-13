package com.tutorial.apidemo.Spring.boot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path = "/api/v1/products")
public class ProductController {





    @GetMapping("")

    // thiss request: http://localhost:8080/api/v1/products
    List<String> getAll(){
        return List.of("Hello" ,"My Name is  Tien", " Nguyen Trung Thanh");
    }
}
