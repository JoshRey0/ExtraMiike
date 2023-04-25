package com.extra.extra.Moduls;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Producto {
    @Id
    private String codigo_producto;
    private String nombre;
    private String dimensiones ;
    private String proveedor;
    private String descripcion ;
    private int cantidad_en_stock ;
    private int precio_venta ;
    private  int precio_proveedor ;
    private String gama;



}
