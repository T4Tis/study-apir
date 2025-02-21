package com.github.t4tis.study_apir;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Produtos")
public class ControllerProduto {


    @PostMapping
    public String create(){
        return "produton cadastrado";
    }

    @PutMapping
    public String update() {
        return "Produto atualizado";
    }

    @GetMapping
    public String find() {
        return "Maça";
    }

    @DeleteMapping
    public void delete(){

    }

}
