package com.extra.extra.Moduls;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Empleado {
    @Id
    private Long codigo_empleado;
    private String nombre;
    private String apellido1 ;
    private String apellido2 ;
    private String extension ;
    private String email ;
    private String puesto ;

   private String codigo_oficina;

    private String codigo_jefe;






}
