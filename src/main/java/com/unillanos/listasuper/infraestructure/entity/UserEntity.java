package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int id;

    @Column(name = "email_user")
    private String email;

    @Column(name = "password_user")
    private String password;

    @Column(name = "type_user")
    private int type;
}
