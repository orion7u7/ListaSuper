package com.unillanos.listasuper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private int id;
    private String url_Location;
    private SuperMarket superMarket;
}
