package com.unillanos.listasuper.domain.model;

import com.unillanos.listasuper.infraestructure.entity.PictureEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperMarket {
    private String name;
    private String description;
    private String schedule;
    private String phone;
    private String facebook;
    private String instagram;
    private String webpage;
    private PictureEntity picture;
}
