package com.unillanos.listasuper.application.usecases;


import com.unillanos.listasuper.domain.model.Product;
import com.unillanos.listasuper.domain.ports.out.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateProductUseCase {

    @Autowired
    private IProductRepository productRepository;

    public Product run(Product product){
        return productRepository.save(product);
    }
}
