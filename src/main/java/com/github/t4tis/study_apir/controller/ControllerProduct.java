package com.github.t4tis.study_apir.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.t4tis.study_apir.service.ProductService;

@RestController
@RequestMapping("Produtos")
public class ControllerProduct {

    private ProductService productservice;

    @PostMapping
    public ResponseEntity<String> create(){
        productservice.createProduct(null);
        return ResponseEntity.status(201).body("produton cadastrado");
    }

    @PutMapping
    public ResponseEntity<String> update() {
        productservice.updateProduct(null, null);
        return ResponseEntity.status(200).body("Produto atualizado");
    }

    @GetMapping
    public String find() {
        productservice.getProductById(null);
        return "Maça";
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(){
        productservice.deleteProduct(null);
        return ResponseEntity.status(204).build();
    }

}
