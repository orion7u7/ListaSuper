package com.unillanos.listasuper.application.usecases;

import com.unillanos.listasuper.domain.model.Product;
import com.unillanos.listasuper.domain.ports.out.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ShowProductUseCase {

    @Autowired
    private IProductRepository productRepository;


    public List<Product> run(){
        return productRepository.findAll();
    }

    public Optional<Product> run(String name){
        return productRepository.findByName(name);
    }
}
