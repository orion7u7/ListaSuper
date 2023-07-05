package com.unillanos.listasuper.domain.ports.out;


import com.unillanos.listasuper.domain.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductRepository {

    Product save(Product product);

    List<Product> findAll();

    Optional<Product> findByName(String name);
}
