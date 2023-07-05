package com.unillanos.listasuper.infraestructure.controllers.transfer.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private String type;
    private String market_name;
    private String picture;
    private int price;
}
