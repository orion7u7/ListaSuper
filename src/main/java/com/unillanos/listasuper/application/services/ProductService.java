package com.unillanos.listasuper.application.services;


import com.unillanos.listasuper.application.usecases.CreateProductUseCase;
import com.unillanos.listasuper.application.usecases.ShowProductUseCase;
import com.unillanos.listasuper.domain.model.Product;
import com.unillanos.listasuper.domain.ports.in.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final CreateProductUseCase createProductUseCase;
    private final ShowProductUseCase showProductUseCase;

    @Override
    public Product createProduct(Product product) {
        return createProductUseCase.run(product);
    }

    @Override
    public List<Product> findAll() {
        return showProductUseCase.run();
    }

    @Override
    public Optional<Product> findByName(String name) {
        return showProductUseCase.run(name);
    }
}
