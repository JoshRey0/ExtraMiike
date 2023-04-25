package com.extra.extra.Moduls;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cliente {
    @Id
    private Long codigo_cliente;
    private String nombre_cliente;
    private String nombre_contacto;
    private String apellido_contacto ;
    private String telefono ;
    private String fax;
    private String linea_direccion1;
    private String linea_direccion2;
    private String ciudad ;
    private  String region ;
    private String pais ;
    private String codigo_postal ;
    private int limite_credito ;

   private int codigo_empleado_rep_ventas;




}
