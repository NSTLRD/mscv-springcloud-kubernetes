package com.starlingdiaz.springcloud.msvc.usuarios.msvcusuarios.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Tbl_usuario")
// @Data te genera los getters y setters y hashcode y equals en tu class//
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String email;
    private String password;

}
