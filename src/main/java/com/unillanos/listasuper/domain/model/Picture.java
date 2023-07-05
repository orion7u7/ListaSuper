package com.unillanos.listasuper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    private int id;
    private String name;
    private String description;
    private String path;
}
