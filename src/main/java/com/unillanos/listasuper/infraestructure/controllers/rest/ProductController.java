package com.unillanos.listasuper.infraestructure.controllers.rest;


import com.unillanos.listasuper.domain.model.Product;
import com.unillanos.listasuper.domain.ports.in.IProductService;
import com.unillanos.listasuper.infraestructure.controllers.transfer.dto.ProductDTO;
import com.unillanos.listasuper.infraestructure.controllers.transfer.responses.GenericResponse;
import com.unillanos.listasuper.infraestructure.mappers.GenericMapper;
import com.unillanos.listasuper.infraestructure.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;
    private final ImageRepository imageRepository;
    private final GenericMapper genericMapper = new GenericMapper();

    @PostMapping("/create")
    public ResponseEntity createProduct(@RequestParam String name,@RequestParam String description,@RequestParam String type,
                                         @RequestParam String market_name, @RequestParam("path") MultipartFile file, @RequestParam int price) {
        ProductDTO product = new ProductDTO();
        product.setName(name);
        product.setDescription(description);
        product.setType(type);
        product.setMarket_name(market_name);
        product.setPicture(imageRepository.uploadFile("picture", file));
        product.setPrice(price);
        Product productCreated = productService.createProduct(genericMapper.map(product, Product.class));
        return ResponseEntity.ok(
                new GenericResponse(productCreated,
                        "Product created")
        );
    }

    @GetMapping("/find")
    public ResponseEntity findAllProducts(){
        return ResponseEntity.ok(
                new GenericResponse(
                        productService.findAll(),
                        "Products found"
                )
        );
    }

    @GetMapping("/find/{name}")
    public ResponseEntity findProduct(@PathVariable String name){
        return ResponseEntity.ok(
                new GenericResponse(
                        productService.findByName(name),
                        "Product found"
                )
        );
    }
}
