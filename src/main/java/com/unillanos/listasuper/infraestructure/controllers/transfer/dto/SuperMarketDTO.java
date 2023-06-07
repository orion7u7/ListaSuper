package com.unillanos.listasuper.infraestructure.controllers.transfer.dto;

import lombok.Data;

@Data
public class SuperMarketDTO {
    private String name;
    private String description;
    private String schedule;
    private String phone;
    private String facebook;
    private String instagram;
    private String webpage;
    private PictureDTO picture;
}
