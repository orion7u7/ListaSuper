package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "picture")
public class PictureEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_picture")
    private int id;

    @Column(name = "name_picture")
    private String name;

    @Column(name = "description_picture")
    private String description;

    @Column(name = "path_picture")
    private String path;
}
