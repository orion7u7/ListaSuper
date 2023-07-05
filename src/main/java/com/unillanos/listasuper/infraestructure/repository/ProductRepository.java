package com.unillanos.listasuper.infraestructure.repository;

import com.unillanos.listasuper.domain.model.Product;
import com.unillanos.listasuper.domain.ports.out.IProductRepository;
import com.unillanos.listasuper.infraestructure.entity.ProductEntity;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements IProductRepository {

    @Autowired
    private JPAProductRepository jpaProductRepository;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = GenericMapper.map(product, ProductEntity.class);
        productEntity = jpaProductRepository.save(productEntity);
        product = GenericMapper.map(productEntity, Product.class);
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<ProductEntity> productEntities = jpaProductRepository.findAll();
        List<Product> products = GenericMapper.mapList(productEntities, Product.class);
        return products;
    }

    @Override
    public Optional<Product> findByName(String name) {
        Optional<ProductEntity> productEntity = jpaProductRepository.findByName(name);
        if(productEntity.isPresent()){
            Product product = GenericMapper.map(productEntity.get(), Product.class);
            return Optional.of(product);
        }
        return Optional.empty();
    }
}
