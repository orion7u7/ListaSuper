package com.unillanos.listasuper.infraestructure.controllers.transfer.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String email;
    private String password;
    private int type;
}
