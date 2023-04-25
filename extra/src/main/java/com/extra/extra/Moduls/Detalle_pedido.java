package com.extra.extra.Moduls;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "detalle_pedido")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Detalle_pedido {

    private int cantidad ;
    private  int precio_unidad ;
    private int numero_linea ;
    @Id
    private Long codigo_pedido;
    private String codigo_producto;

}
