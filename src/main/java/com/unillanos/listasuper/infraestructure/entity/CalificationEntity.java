package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="calification")
public class CalificationEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calification")
    private int id;

    private float score;

    private String coment;

    @ManyToOne
    @JoinColumn(name = "id_market", referencedColumnName = "id_market", nullable = false)
    private SuperMarketEntity market;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false)
    private UserEntity user;

}
