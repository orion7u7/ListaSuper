package com.unillanos.listasuper.domain.ports.in;

import com.unillanos.listasuper.domain.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProductService {

    Product createProduct(Product product);
    List<Product> findAll();

    Optional<Product> findByName(String name);
}
