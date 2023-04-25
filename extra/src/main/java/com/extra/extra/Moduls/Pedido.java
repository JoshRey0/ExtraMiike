package com.extra.extra.Moduls;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pedido {
    @Id
    private Long codigo_pedido ;
    private String fecha_pedido;
    private String fecha_esperada;
    private String fecha_entrega ;
    private String estado ;
    private String comentarios;
    private int codigo_cliente;

}
