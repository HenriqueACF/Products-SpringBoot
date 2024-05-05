package com.example.springboot.Controllers;

import com.example.springboot.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired //INJETANDO DEPENDENCIAS
    ProductRepository productRepository;



}
