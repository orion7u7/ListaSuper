package com.unillanos.listasuper.infraestructure.controllers.transfer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericResponse <T>{
    private T data;
    private String message;
}
