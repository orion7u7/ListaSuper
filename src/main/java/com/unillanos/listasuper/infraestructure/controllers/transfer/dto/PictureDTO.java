package com.unillanos.listasuper.infraestructure.controllers.transfer.dto;

import lombok.Data;

@Data
public class PictureDTO {
    private String name;
    private String description;
    private byte[] picture;
}
