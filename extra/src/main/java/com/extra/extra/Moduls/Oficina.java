package com.extra.extra.Moduls;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "oficina")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Oficina {

    @Id
    private String codigo_oficina;

    private String ciudad ;
    private String pais ;
    private String region ;
    private String codigo_postal ;
    private String telefono;
    private String linea_direccion1 ;
    private String linea_direccion2 ;





}
